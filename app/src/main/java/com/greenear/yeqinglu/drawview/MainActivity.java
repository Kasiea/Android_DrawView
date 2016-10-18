package com.greenear.yeqinglu.drawview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout root = (LinearLayout)findViewById(R.id.activity_main);
        final DrawView draw = new DrawView(this);
        draw.setMinimumWidth(300);
        draw.setMinimumHeight(500);

    }
}
