package com.example.zgfei.demoofijkplayer.test;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zgfei.demoofijkplayer.R;

public class SimpleTestActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, SimpleTestActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_test);
    }
}
