package com.example.myapplication_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButton1Clicked(View v){
        Toast.makeText(this, "Test Long Check", Toast.LENGTH_LONG).show();
        //LENGTH_LONG 긴시간동안 팝업창을 띄웁니다
        //LENGTH_SHORT 짧은 시간동안 팝업창을 띄웁니다
        //LENGTH_INDEFINITE 팝업창을 무기한을 띄웁니다
    }
    public void onButton2Clicked(View v){
        Toast.makeText(this,"Test Short Check", Toast.LENGTH_SHORT).show();
    }
}