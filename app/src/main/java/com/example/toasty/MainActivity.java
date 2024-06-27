package com.example.toasty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.showToast(this,"hello world");
        ConfigMethods configMethods = new ConfigMethods();
        configMethods.registerMenu();

    }
}