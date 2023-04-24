package com.example.march_12_mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.AutoCompleteTextView;

public class autocompletetextview extends AppCompatActivity {
    String[] language = {"C","C++","Java","Kotlin","Android","PHP","Flutter","HTML","React","CSS"};
   Button button2;
    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autocompletetextview);
        ArrayAdapter aaa = new ArrayAdapter(this, android.R.layout.select_dialog_item,language);
        //editText=findViewById(R.id.editTextTextPersonName);

        AutoCompleteTextView actv=(AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        actv.setThreshold(1);
        actv.setAdapter(aaa);
        actv.setTextColor(Color.CYAN);
        button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(autocompletetextview.this ,listviewdemo.class);
                startActivity(intent2);
            }
        });
    }
}