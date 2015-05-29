package com.giog.uplife;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PlacesFragment extends Fragment {

    public static PlacesFragment newInstance() {
        PlacesFragment fragment = new PlacesFragment();
        return fragment;
    }

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_groups, container, false);

        List<ListItem> list = new ArrayList<>();

        list.add(new ListItem(R.drawable.place4,"Academia Raíz",
                "Localizada no Potal, a academia raíz conta com os melhores equipamentos da cidade. Venha fazer uma visita",
                "",true));

        list.add(new ListItem(R.drawable.place5,"Academia Monster Corpus",
                "Academia bem equipada e com preços acessíveis localizada na Baixada do Golias",
                "",false));

        list.add(new ListItem(R.drawable.place1,"Pracinha da saúde",
                              "Pracinha localizada no bairro do limoeiro com vista para o mar. Ótimo lugar para se exercitar",
                              "",false));

        list.add(new ListItem(R.drawable.place2,"Academia a céu aberto",
                "Ambiente agradável e com ar puro. Próxima ao condomínio morada de Zeus no Bairro Vermlho",
                "",false));

        list.add(new ListItem(R.drawable.place3,"Porto de caiaque",
                "Equipamentos para se exercitar de graça ao lado de aluguel de caiaques. Termine seus exercícios remando na praia da Vista Vascaína",
                "",false));

        ListView listView = (ListView) view.findViewById(R.id.list);

        CustomListAdapter adapter = new CustomListAdapter(list,getActivity());
        listView.setAdapter(adapter);

        return view;
    }
}
