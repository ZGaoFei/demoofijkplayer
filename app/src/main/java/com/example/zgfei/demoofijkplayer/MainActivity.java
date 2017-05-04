package com.example.zgfei.demoofijkplayer;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.zgfei.demoofijkplayer.R;
import com.example.zgfei.demoofijkplayer.example.activities.FileExplorerActivity;
import com.example.zgfei.demoofijkplayer.test.SimpleTestActivity;

public class MainActivity extends AppCompatActivity {
    private Context context;

    private Button btOne;
    private Button btTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        initView();
    }

    private void initView() {
        btOne = (Button) findViewById(R.id.bt_one);
        btOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: 2017/5/3 skip to other page
                SimpleTestActivity.start(context);
            }
        });

        btTwo = (Button) findViewById(R.id.bt_two);
        btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FileExplorerActivity.start(context);
            }
        });
    }
}
