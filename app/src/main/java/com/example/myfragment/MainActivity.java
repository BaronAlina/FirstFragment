package com.example.myfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView, textView2, textView3, textView4, textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.tV);
        textView2=findViewById(R.id.tV2);
        textView3=findViewById(R.id.tV3);
        textView4=findViewById(R.id.tV4);
        textView5=findViewById(R.id.tV5);
    }

    public void onClick(View v){
        Intent intent=new Intent();
        switch (v.getId()){
            case R.id.tV:
                intent.setClass(this, DetailActivity.class);
                startActivity(intent);
                break;
        }
    }

    }
