package com.example.toastymodule1;

import android.content.Context;
import android.widget.Toast;

public class AlarmUtils {

    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
