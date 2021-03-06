package com.example.android.touruganda;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelFragment extends Fragment {
    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment_hotel, container, false);

        ArrayList<TourItem> tourItems = new ArrayList<>();

        tourItems.add(new TourItem(getString(R.string.hotel_name1), getString(R.string.hotel_desc1), getString(R.string.hotel_addr1), R.drawable.ashima));
        tourItems.add(new TourItem(getString(R.string.hotel_name2), getString(R.string.hotel_description2), getString(R.string.hotel_addr2),R.drawable.c21));

        ListView listView = (ListView) rootView.findViewById(R.id.hotel_lv);
        TourAdapter tourAdapter = new TourAdapter(rootView.getContext(), tourItems);
        listView.setAdapter(tourAdapter);

        return rootView;
    }

}
