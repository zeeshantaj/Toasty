package com.example.toastymodule1;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Toast;

public class CommonUtilsMethods {
    public static void commonToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

    }

}
