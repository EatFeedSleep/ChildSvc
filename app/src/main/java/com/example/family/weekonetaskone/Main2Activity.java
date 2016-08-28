package com.example.family.weekonetaskone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String uriString;
    String theText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final TextView et2=(TextView) findViewById(R.id.textView3);
//convert text into string
        theText = et2.getText().toString();
        Intent i = getIntent();
        uriString = i.getStringExtra("text_label");


       // et2.setText(getIntent().getStringExtra("text_label"));
    }
}
