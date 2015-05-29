package com.giog.uplife;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DietFragment extends Fragment {

    public static DietFragment newInstance() {
        DietFragment fragment = new DietFragment();
        return fragment;
    }

    public DietFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_groups, container, false);

        List<ListItem> list = new ArrayList<>();

        list.add(new ListItem(0,"Dieta do leite",
                              "Laticínios fazem bem e têm bastante proteína. Uma dieta a base de laticínios te faz ingerir menos calorias e não passar fome",
                              "",false));

        list.add(new ListItem(0,"Dieta do vegano",
                "Alimentos a base de soja fazem parte do novo cardápio de grande parte das pessoas no mundo e faz bem à saúde",
                "",false));

        list.add(new ListItem(0,"Dieta radical",
                "É difícil largar alguns hábitos. Mas se eles são os reponsáveis por tirar sua saúde, é hora de ser radical.",
                "",false));

        list.add(new ListItem(0,"Raízes",
                "Foi comprovado científicamente que raízes possuem bastante vitamina. Criamos então esta dieta a base de raízes",
                "",false));

        ListView listView = (ListView) view.findViewById(R.id.list);

        CustomListAdapter adapter = new CustomListAdapter(list,getActivity());
        listView.setAdapter(adapter);

        return view;
    }
}
