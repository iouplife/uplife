package com.giog.uplife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class LoginFragment extends Fragment implements View.OnClickListener {

    public static LoginFragment newInstance() {
        LoginFragment fragment = new LoginFragment();
        return fragment;
    }

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        Button btnLogin = (Button) view.findViewById(R.id.btnLogin);
        Button btnLoginG = (Button) view.findViewById(R.id.btnLoginG);
        Button btnLoginFb = (Button) view.findViewById(R.id.btnLoginFB);

        btnLogin.setOnClickListener(this);
        btnLoginFb.setOnClickListener(this);
        btnLoginG.setOnClickListener(this);

        TextView singup = (TextView) view.findViewById(R.id.singup);
        singup.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.singup:
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction.replace(R.id.container, SingupFragment.newInstance());
                transaction.commit();
                break;

            default:
                startActivity(new Intent(getActivity(), HomeActivity.class));
                getActivity().finish();

        }
    }
}
