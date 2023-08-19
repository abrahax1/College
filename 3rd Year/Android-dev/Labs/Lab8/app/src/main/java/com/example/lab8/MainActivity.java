package com.example.lab8;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // These are the global variables
    EditText editName, editPassword;
    TextView result;
    Button buttonSubmit, buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Manager dbManager = new Manager (this);
        dbManager.open();

        editName  = (EditText) findViewById(R.id.editName);
        editPassword = (EditText) findViewById(R.id.editPassword);
        result = (TextView) findViewById(R.id.tvResult);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        buttonReset = (Button) findViewById(R.id.buttonReset);

        // Attaching OnClick listener to the submit button
        buttonSubmit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // Get the Data and Use it
                // get text from EditText name view
                String name = editName.getText().toString();
                // get text from EditText password view
                String password = editPassword.getText().toString();
                Log.d("Insert: ", "Inserting ..");
                dbManager.insertPerson(name, password, "good");
                result.setText("Name:\t" + name + "\nPassword:\t" + password );
            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // clearing out all the values
                editName.setText("");
                editPassword.setText("");
                result.setText("");
                editName.requestFocus();
            }
        });
    }
}