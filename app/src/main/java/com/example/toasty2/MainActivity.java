package com.example.toasty2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toasty.R;
import com.example.toastymodule1.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.showToast(this,"hello world");

    }
}