package com.giog.uplife;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class HomeActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private ListView lvMenu;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, ProfileFragment.newInstance())
                    .commit();
        }

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lvMenu = (ListView) findViewById(R.id.lvMenu);
        lvMenu.setOnItemClickListener(this);
        lvMenu.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,getResources().getStringArray(R.array.menu)));

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.abriu,R.string.fechou){
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                invalidateOptionsMenu();
                syncState();
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu();
                syncState();
            }
        };

        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        lvMenu.performItemClick(null,0,0);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                getSupportActionBar().setTitle("Perfil");
                fragment = ProfileFragment.newInstance();
                break;

            case 1:
                getSupportActionBar().setTitle("Grupos");
                fragment = GroupsFragment.newInstance();
                break;

            case 2:
                getSupportActionBar().setTitle("Lugares para exercícios");
                fragment = PlacesFragment.newInstance();
                break;

            case 3:
                getSupportActionBar().setTitle("Eventos");
                fragment = EventsFragment.newInstance();
                break;

            case 4:
                getSupportActionBar().setTitle("Dietas");
                fragment = DietFragment.newInstance();
                break;
        }
        if(fragment != null){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            transaction.replace(R.id.container, fragment);
            transaction.commit();
        }

        if(drawerLayout.isDrawerOpen(lvMenu)){
            drawerLayout.closeDrawer(lvMenu);
        }
    }
}
