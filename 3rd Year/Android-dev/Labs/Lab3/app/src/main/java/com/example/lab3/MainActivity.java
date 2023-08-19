package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    // Variable to link to our widget
    ListView country_list;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // We link our widget by finding its id (name)
        country_list = (ListView) findViewById(R.id.country_list);

        // Our data structure to store our information about cities
        ArrayList<String> city_array = new ArrayList<>();

        // We add a city to our array
        city_array.add("Shanghai");
        city_array.add("Ireland");
        city_array.add("Venezuela");

        // We create the adapter to act as a driver between our data structure and the displayed widget
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, city_array);
        country_list.setAdapter(adapter);

        country_list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?>adapterView, View view, int i, long l)
            {
                Toast.makeText(MainActivity.this, "You have clicked in " + i, Toast.LENGTH_SHORT).show();

                // This mechanism allows you to call open a new activity in your screen
                Intent intent = new Intent(MainActivity.this, DisplayInfo.class);

                // Bundle is the android mechanism to pass parameter to other activity
                Bundle b = new Bundle();

                if (i == 0)
                {
                    b.putString("city", "Shanghai"); //Your id
                    b.putString("country", "China"); //Your id
                    b.putInt("city_population", 24153000);
                    b.putInt("metro_population", 34000000);
                }
                else if (i == 1)
                {
                    b.putString("city", "Dublin"); //Your id
                    b.putString("country", "Ireland"); //Your id
                    b.putInt("city_population", 24153000);
                    b.putInt("metro_population", 34000000);
                }
                else if (i == 2)
                {
                    b.putString("city", "Caracas"); //Your id
                    b.putString("country", "Venezuela"); //Your id
                    b.putInt("city_population", 24153000);
                    b.putInt("metro_population", 34000000);
                }

                intent.putExtras(b); //Put your id to your next Intent
                startActivity(intent); // Start the new activity

            }
        });

    }

}