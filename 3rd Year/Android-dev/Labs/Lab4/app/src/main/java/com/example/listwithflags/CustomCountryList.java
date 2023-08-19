package com.example.listwithflags;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.Toast;


public class CustomCountryList extends ArrayAdapter
{
    private String[] countryNames;
    private String[] capitalNames;
    private Integer[] imageid;
    private Activity context;
    private Object AdapterView;

    public CustomCountryList(Activity context, String[] countryNames, String[] capitalNames, Integer[] imageid)
    {
        super(context, R.layout.row_item, countryNames);
        this.context = context;
        this.countryNames = countryNames;
        this.capitalNames = capitalNames;
        this.imageid = imageid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View row=convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            row = inflater.inflate(R.layout.row_item, null, true);

        TextView textViewCountry = (TextView) row.findViewById(R.id.textViewCountry);
        TextView textViewCapital = (TextView) row.findViewById(R.id.textViewCapital);
        ImageView imageFlag = (ImageView) row.findViewById(R.id.imageViewFlag);
        
        textViewCountry.setText(countryNames[position]);
        textViewCapital.setText(capitalNames[position]);
        imageFlag.setImageResource(imageid[position]);

        textViewCountry.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (position==0)
                {
                    Toast.makeText(context.getApplicationContext(), "India", Toast.LENGTH_SHORT).show();
                }
                if (position==1)
                {
                    Toast.makeText(context.getApplicationContext(), "China", Toast.LENGTH_SHORT).show();
                }
                if (position==2)
                {
                    Toast.makeText(context.getApplicationContext(), "Nepal", Toast.LENGTH_SHORT).show();
                }
                if (position==3)
                {
                    Toast.makeText(context.getApplicationContext(), "Bhutan", Toast.LENGTH_SHORT).show();
                }
            }
        });

        textViewCapital.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (position==0)
                {
                    Toast.makeText(context.getApplicationContext(), "Delhi", Toast.LENGTH_SHORT).show();
                }
                if (position==1)
                {
                    Toast.makeText(context.getApplicationContext(), "Beijing", Toast.LENGTH_SHORT).show();
                }
                if (position==2)
                {
                    Toast.makeText(context.getApplicationContext(), "Kathmandu", Toast.LENGTH_SHORT).show();
                }
                if (position==3)
                {
                    Toast.makeText(context.getApplicationContext(), "Thimphu", Toast.LENGTH_SHORT).show();
                }
            }
        });

        imageFlag.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (position==0)
                {
                    Toast.makeText(context.getApplicationContext(), "India Flag", Toast.LENGTH_SHORT).show();
                }
                if (position==1)
                {
                    Toast.makeText(context.getApplicationContext(), "China Flag", Toast.LENGTH_SHORT).show();
                }
                if (position==2)
                {
                    Toast.makeText(context.getApplicationContext(), "Nepal Flag", Toast.LENGTH_SHORT).show();
                }
                if (position==3)
                {
                    Toast.makeText(context.getApplicationContext(), "Bhutan Flag", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return  row;
    }
}

