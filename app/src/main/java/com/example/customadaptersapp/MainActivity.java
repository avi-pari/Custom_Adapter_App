package com.example.customadaptersapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 - AdapterView : ListView
        listView = findViewById(R.id.listview);

        // 2 - Data Source
        String[] countries = {"USA", "Germany", "Saudi Arabia", "France" };

        // 3 - Adapter: acts as a bridge between the
        //          ' data source ' and the 'AdapterView'

        /*ArrayAdapter<String> adapter = new ArrayAdapter<>(

                this,
                 android.R.layout.simple_list_item_1,
                 countries
        );*/

        MyCustomAdapter  adapter = new MyCustomAdapter(this,countries);

        // Link ListView  with the Adapter
        listView.setAdapter(adapter);


    }
}