package com.example.madlab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView simpleListView;

    // array objects
    String countryList[] = {"Argentina","Australia","Bangladesh","Brazil","Canada","Colombia","Cuba","Denmark","Egypt","Ethiopia",
            "Finland","France","Germany","Greece","Hungary","Iceland","India","Israel"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Container - UI Component
        simpleListView = (ListView) findViewById(R.id.simpleAdapter);

        //Adapter

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,
                R.layout.items_view, R.id.itemTextView, countryList);

        simpleListView.setAdapter(arrayAdapter);

        //LISTENER
        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, countryList[i], Toast.LENGTH_SHORT).show();
            }
        });



    }
}