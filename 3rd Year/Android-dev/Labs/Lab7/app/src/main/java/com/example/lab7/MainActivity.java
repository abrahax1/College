package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView outputText;
    private static final String TAG = "IT472";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = findViewById(R.id.outputText);
    }

    public void runTask(View v)
    {
        // VERSION 1a
        // Running a task in a separate thread
        Thread thread = new Thread()
        {
            public void run( ) {

                Log.i(TAG, "Thread Started");

                try
                {
                    // simulated long-running task
                    Thread.sleep(10000);

                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

                Log.i(TAG, "Thread Finished");
            }
        };
        thread.start();
    }

    public void generateContent(View view)
    {
        outputText.setText("Random number: \n"+ Math.random());
    }
}