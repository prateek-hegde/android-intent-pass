package com.example.prateekhegde.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Intent intent = getIntent();
        message = getIntent().getStringExtra("int");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);

    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}
