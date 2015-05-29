package com.giog.uplife;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProfileFragment extends Fragment {

    public static ProfileFragment newInstance() {
        ProfileFragment fragment = new ProfileFragment();
        return fragment;
    }

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        ListView lvWorkoutRoutineA = (ListView) view.findViewById(R.id.lvWorkoutRoutineA);
        lvWorkoutRoutineA.setAdapter(new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,getResources().getStringArray(R.array.workout_routineA)));

        ListView lvWorkoutRoutineB = (ListView) view.findViewById(R.id.lvWorkoutRoutineB);
        lvWorkoutRoutineB.setAdapter(new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,getResources().getStringArray(R.array.workout_routineB)));

        ListView lvWorkoutRoutineC = (ListView) view.findViewById(R.id.lvWorkoutRoutineC);
        lvWorkoutRoutineC.setAdapter(new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,getResources().getStringArray(R.array.workout_routineC)));
        return view;
    }

}
