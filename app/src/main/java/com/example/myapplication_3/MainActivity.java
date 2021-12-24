package com.example.myapplication_3;

import android.content.Intent;
import android.net.Uri;
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
    }
    //LENGTH_LONG 긴시간동안 팝업창을 띄웁니다
    //LENGTH_SHORT 짧은 시간동안 팝업창을 띄웁니다
    //LENGTH_INDEFINITE 팝업창을 무기한을 띄웁니다
    public void onButton2Clicked(View v){
        Toast.makeText(this,"Test Short Check", Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/webhp?hl=ko&ictx=2&sa=X&ved=0ahUKEwin9Kf9mfv0AhW27HMBHeloAfMQPQgI"));
        startActivity(myIntent);
    }
    //Intent 어떤 기능을 실핼할것인 지정할 때 사용합니다
    //Toast 화면에 잠깐 보였다 없어지는 메시지를 간단하게 보여주고 싶을 때 사용합니다
    public void onButton3Clicked(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-5503-2683"));
        startActivity(myIntent); 
    }
    //tel:010-0000-0000 그대로 입력 안하고 변형시켜서 입력하면 전화창으로 넘어가지 않습니다
}