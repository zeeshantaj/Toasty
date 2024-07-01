package com.example.toasty2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toasty.R;
import com.example.toastymodule1.AlarmUtils;
import com.example.toastymodule1.CommonUtilsMethods;
import com.example.toastymodule1.DBModelCategory;
import com.example.toastymodule1.Toaster;
import com.example.toastymodule1.UiHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.showToast(this,"hello world");
        CommonUtilsMethods.commonToast(this,"haha");
        //AlarmUtils.showToast();
        //DBModelCategory.showToast();
        //UiHelper


    }
}