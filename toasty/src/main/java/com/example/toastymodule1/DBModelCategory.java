package com.example.toastymodule1;

import android.content.Context;
import android.widget.Toast;

public class DBModelCategory {

    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
