package com.example.lab6;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MonthList extends ArrayAdapter
{
    private String[] months;
    private Integer[] imageid;
    private Activity context;
    private Object AdapterView;

    public MonthList(Activity context, String[] months, Integer[] imageid)
    {
        super(context, R.layout.row_item, months);
        this.context = context;
        this.months = months;
        this.imageid = imageid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View row=convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            row = inflater.inflate(R.layout.row_item, null, true);

        TextView textViewMonth = (TextView) row.findViewById(R.id.textViewCountry);
        ImageView imageTick = (ImageView) row.findViewById(R.id.imageViewFlag);

        textViewMonth.setText(months[position]);
        if (position < 11)
        {
            imageTick.setImageResource(imageid[2]);
        }
        else
        {
            imageTick.setImageResource(imageid[1]);
        }


        textViewMonth.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (position==0)
                {
//                    if (imageid == 1)
                    imageTick.setImageResource(imageid[1]);
//                    if (imageid[0] == 0)
//                    {
//                        imageTick.setImageResource(imageid[1]);
//                    }
//                    else
//                    {
//                        imageTick.setImageResource(imageid[0]);
//                    }
                }
                if (position==1)
                {
                    imageTick.setImageResource(imageid[1]);
                }
                if (position==2)
                {
                    imageTick.setImageResource(imageid[1]);
                }
                if (position==3)
                {
                    imageTick.setImageResource(imageid[1]);
                }
                if (position==4)
                {
                    imageTick.setImageResource(imageid[1]);
                }
                if (position==5)
                {
                    imageTick.setImageResource(imageid[1]);
                }
                if (position==6)
                {
                    imageTick.setImageResource(imageid[1]);
                }
                if (position==7)
                {
                    imageTick.setImageResource(imageid[1]);
                }
                if (position==8)
                {
                    imageTick.setImageResource(imageid[1]);
                }
                if (position==9)
                {
                    imageTick.setImageResource(imageid[1]);
                }
                if (position==10)
                {
                    imageTick.setImageResource(imageid[1]);
                }
                if (position==11)
                {
                    imageTick.setImageResource(imageid[1]);
                }
                if (position==12)
                {
                    imageTick.setImageResource(imageid[1]);
                }

            }
        });

        return  row;
    }
}


