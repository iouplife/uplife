package com.giog.uplife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GroupsFragment extends Fragment {

    public static GroupsFragment newInstance() {
        GroupsFragment fragment = new GroupsFragment();
        return fragment;
    }

    public GroupsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_groups, container, false);

        List<ListItem> list = new ArrayList<>();

        list.add(new ListItem(0,"Grupo da maromba",
                              "Grupo criado para juntar a galera que gosta de uma boa malhação ao ar livre",
                              ""));

        list.add(new ListItem(0,"Todos zen",
                "Junte-se a nós e seja zen praticando Yoga na praia durante todo o dia e aproveite para dar tchau ao Sol às 17:30",
                ""));

        list.add(new ListItem(0,"3ª Idade Fit",
                "Grupo criado com o intuito de educar fisicamente idosos garantindo-lhes boa saúde e condição de vida. Você também pode participar como voluntário",
                ""));

        list.add(new ListItem(0,"Grupo da gastronomia do bem",
                "Sempre discutimos receitas saudáveis mas deliciosas. Satisfaça seu paladar sem sair da dieta",
                ""));

        ListView listView = (ListView) view.findViewById(R.id.list);

        CustomListAdapter adapter = new CustomListAdapter(list,getActivity());
        listView.setAdapter(adapter);

        return view;
    }
}
