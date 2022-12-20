package com.wallet.everdogewallet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class HomeFragment extends Fragment {

    ImageView optionmenu;

    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_home, container, false);

        optionmenu=view.findViewById(R.id.menu_option);

        optionmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustom.showbottomsheet(getContext());
            }
        });

        return view;
    }
}