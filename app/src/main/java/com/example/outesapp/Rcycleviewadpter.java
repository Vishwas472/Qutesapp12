package com.example.outesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Rcycleviewadpter extends RecyclerView.Adapter<Rcycleviewadpter.Myviewholder> {
    MainActivity mainActivity;
    ArrayList<model> caategories;

    interface1 interface1;


    public Rcycleviewadpter(MainActivity mainActivity, ArrayList<model> caategories, interface1 interface1) {
        this.mainActivity=mainActivity;
        this.caategories=caategories;
        this.interface1=interface1;
    }

    @NonNull
    @Override
    public Rcycleviewadpter.Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mainActivity).inflate(R.layout.recycle_view_item_file,parent,false);
        Myviewholder w=new Myviewholder(v);
        return w;
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
        holder.textCategories.setText( caategories.get(position).getName());
        holder.imag123.setImageResource(caategories.get(position).getImage());
        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interface1.categoriesclick(caategories.get( position).name);
            }
        } );
   }

    @Override
    public int getItemCount() {

        return caategories.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder {

        TextView textCategories;

        ImageView imag123;

        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            textCategories=itemView.findViewById(R.id.textCategories);
            imag123=itemView.findViewById(R.id.imag123);

        }
    }
}
