package com.example.outesapp;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class oqtescatadpter extends RecyclerView.Adapter<oqtescatadpter.Myviewholder> {
    Context oqtesactivity;
    ArrayList<modelqoutes> w;
    public oqtescatadpter(Oqtesactivity oqtesactivity, ArrayList<modelqoutes> w) {
        this.oqtesactivity=oqtesactivity;
        this.w=w;
    }


    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(oqtesactivity).inflate(R.layout.qutoes_iteam_file, parent, false);
        Myviewholder m = new Myviewholder(view);

        return m;
    }

    @Override
    public void onBindViewHolder(@NonNull oqtescatadpter.Myviewholder holder, int position) {
        holder.txtname.setText(w.get(position).quotes);
        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Intent.ACTION_SEND);
                p.setType("text/plain");
//
                String shyari_item = w.get( position ).quotes;
                p.putExtra(Intent.EXTRA_TEXT, shyari_item);
                Intent chooser = Intent.createChooser(p, "Share");
                chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                oqtesactivity.startActivity(chooser);
            }
        });
        holder.copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ClipboardManager clipboard = (ClipboardManager) oqtesactivity.getSystemService(Context.CLIPBOARD_SERVICE);
                        ClipData clip = ClipData.newPlainText("simple text",  holder.txtname.getText().toString());
                        clipboard.setPrimaryClip(clip);
                        Toast.makeText(oqtesactivity, "Copy Success", Toast.LENGTH_SHORT).show();

                    }
        });
    }

    @Override
    public int getItemCount() {

        return w.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder {
        TextView txtname;
        ImageView share,copy;
        public Myviewholder(@NonNull View itemView) {
            super( itemView );
            txtname=itemView.findViewById( R.id.txtname );
            share=itemView.findViewById( R.id.share );
            copy=itemView.findViewById( R.id.copy );

        }
    }
}
