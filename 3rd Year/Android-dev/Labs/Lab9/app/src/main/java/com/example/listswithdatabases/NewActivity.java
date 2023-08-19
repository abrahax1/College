package com.example.listswithdatabases;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class NewActivity extends Activity
{

    TextView data;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_screen);
        Intent intentData = getIntent();
        String dataRetrieved = intentData.getStringExtra("data");
        data = (TextView)findViewById(R.id.data);
        data.setText(dataRetrieved);


    }

}