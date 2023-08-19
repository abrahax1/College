package com.example.assignment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private final Context context;
    Activity activity;
    private ArrayList PERSON_ID, PERSON_NAME, PERSON_WORK_TIME;

    public Adapter(Activity activity, Context context, ArrayList PERSON_ID, ArrayList PERSON_NAME, ArrayList PERSON_WORK_TIME){
        this.activity = activity;
        this.context = context;
        this.PERSON_ID = PERSON_ID;
        this.PERSON_NAME = PERSON_NAME;
        this.PERSON_WORK_TIME = PERSON_WORK_TIME;
    }

    // uses LayoutInflater to create the objects needed for each person details in the show_items xml
    @NonNull @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.show_items_db, parent, false);
        return new ViewHolder(view);
    }

    // Set old values using their positions into the update EditText's, TextView
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.PERSON_ID.setText(String.valueOf(PERSON_ID.get(position)));
        holder.PERSON_NAME.setText(String.valueOf(PERSON_NAME.get(position)));
        holder.PERSON_WORK_TIME.setText(String.valueOf(PERSON_WORK_TIME.get(position)));

        holder.ShowItems.setOnClickListener(view -> {
            Intent intent = new Intent(context, update_persons.class);
            intent.putExtra("ID", String.valueOf(PERSON_ID.get(position)));
            intent.putExtra("Name", String.valueOf(PERSON_NAME.get(position)));
            intent.putExtra("Work_Time", String.valueOf(PERSON_WORK_TIME.get(position)));
            activity.startActivityForResult(intent, 1);
        });
    }

    @Override
    public int getItemCount() {
        return PERSON_ID.size();
    }

    // Creates the needed Objects for details
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView PERSON_ID, PERSON_NAME, PERSON_WORK_TIME;
        TableLayout ShowItems;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            PERSON_ID = itemView.findViewById(R.id.person_id);
            PERSON_NAME = itemView.findViewById(R.id.person_name);
            PERSON_WORK_TIME = itemView.findViewById(R.id.person_time);
            ShowItems = itemView.findViewById(R.id.ShowItems);
        }
    }
}
