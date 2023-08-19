package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // storing ID of the button in a variable
        Button button = (Button)findViewById(R.id.ButtonA);
        Button button2 = (Button)findViewById(R.id.ButtonB);
        TextView counter = (TextView) findViewById(R.id.Counter);

        // operations to be performed when user tap on the button
        if (button != null)
        {
            button.setOnClickListener((View.OnClickListener)(new View.OnClickListener()
            {
                public final void onClick(View it)
                {
                    // displaying a toast message
                    Toast.makeText((Context) MainActivity.this, "You just" +
                            " clicked button A", Toast.LENGTH_LONG).show();
                    clicks += 1;
                    counter.setText("Number of clicks: "+ clicks);
                }

            }));

            button2.setOnClickListener((View.OnClickListener)(new View.OnClickListener()
            {
                public final void onClick(View it)
                {
                    // displaying a toast message
                    Toast.makeText((Context) MainActivity.this, "You just" +
                            " clicked button B", Toast.LENGTH_LONG).show();
                    clicks -= 1;
                    counter.setText("Number of clicks: "+ clicks);

                }

            }));

        }
    }
}
