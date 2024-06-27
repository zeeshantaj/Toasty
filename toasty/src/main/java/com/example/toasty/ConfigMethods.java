package com.example.toasty;

import android.content.Context;
import android.widget.Toast;

public class ConfigMethods {
    public static void showToast2(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
