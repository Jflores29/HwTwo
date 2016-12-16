package com.javier.hwtwo;

import android.graphics.drawable.StateListDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.txtview);

        //StateListDrawable drawable = new StateListDrawable();
       // drawable.addState(int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, );
    }
}
