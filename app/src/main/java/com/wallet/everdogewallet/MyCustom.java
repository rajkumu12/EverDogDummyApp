package com.wallet.everdogewallet;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MyCustom {

    public static void showDailog(Context context) {
        Dialog dialog = new Dialog(context, android.R.style.Theme_Light);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.custom_dialog_login);
        ImageView close =dialog.findViewById(R.id.close);
        TextView create_wallet =dialog.findViewById(R.id.create_wallet);
        TextView import_wallet =dialog.findViewById(R.id.importwallet);
        LinearLayout connect_wallet =dialog.findViewById(R.id.layout_cnw);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });


        create_wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,CreateWalletActivity.class));
            }
        });

        import_wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,ImportActivity.class));
            }
        });

        connect_wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,ConnectWalletActivity.class));
            }
        });

        dialog.show();
    }


    public static void showbottomsheet(Context context){

        final BottomSheetDialog dialog = new BottomSheetDialog(context);
        dialog.setContentView(R.layout.bottomsheetlayout);
        dialog.setCanceledOnTouchOutside(false);

        ImageView btnClose = dialog.findViewById(R.id.closesheet);
        TextView scan = dialog.findViewById(R.id.txt_scan);
        TextView locknow =  dialog.findViewById(R.id.txtLocknow);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        locknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,LockViewActivity.class));
            }
        });
        dialog.show();
    }

}
