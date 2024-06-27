package com.example.toasty;

import android.content.Context;
import android.widget.Toast;

public class OwnCommonUtils {
    public static void showToast1(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
