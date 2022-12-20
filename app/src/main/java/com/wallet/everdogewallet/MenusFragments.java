package com.wallet.everdogewallet;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MenusFragments extends Fragment {

    ImageView optionmenu;
    RelativeLayout relativeLayout_lock;
    public MenusFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_menus_fragments, container, false);

        optionmenu=view.findViewById(R.id.menu_option);
        relativeLayout_lock=view.findViewById(R.id.rly_lockview);

        optionmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustom.showbottomsheet(getContext());
            }
        });

        relativeLayout_lock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getContext().startActivity(new Intent(getContext(),LockViewActivity.class));
            }
        });
        return view;
    }
}