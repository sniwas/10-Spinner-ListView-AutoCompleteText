package com.example.march_12_mainactivity;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
public class listviewdemo extends AppCompatActivity {
    ListView lv;
    TextView tv;
    String [] listitem;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewdemo);
        lv=findViewById(R.id.listviews);
        tv=findViewById(R.id.textview9);
        listitem=getResources().getStringArray(R.array.language);
       final ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,listitem);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=arrayAdapter.getItem(position);
                Toast.makeText(listviewdemo.this, value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}