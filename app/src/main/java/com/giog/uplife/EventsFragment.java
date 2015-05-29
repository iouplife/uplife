package com.giog.uplife;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class EventsFragment extends Fragment {

    public static EventsFragment newInstance() {
        EventsFragment fragment = new EventsFragment();
        return fragment;
    }

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_groups, container, false);

        List<ListItem> list = new ArrayList<>();

        list.add(new ListItem(R.drawable.event1,"Triathlon!",
                              "Venha participar do XV Triathlon Iemanjá. O circuito começa na orla do Pontal e vai até o Salobrinho",
                              "01/09/15 08:00"));

        list.add(new ListItem(R.drawable.event2,"II Remada da Prainha",
                "Treine bastante e traga o seu caiaque para a II Remada da Prainha.",
                "05/11/15 09:00"));

        list.add(new ListItem(R.drawable.event3,"I GP de Jet Ski da Bahia",
                "Turbine seu Jet Ski e compareça ao I GP de Jet Ski da Bahia que ocorrerá no hidródromo dos alagados",
                "11/12/15 07:30"));

        ListView listView = (ListView) view.findViewById(R.id.list);

        CustomListAdapter adapter = new CustomListAdapter(list,getActivity());
        listView.setAdapter(adapter);

        return view;
    }
}
