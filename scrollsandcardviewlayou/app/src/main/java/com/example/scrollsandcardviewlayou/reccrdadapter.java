package com.example.scrollsandcardviewlayou;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class reccrdadapter extends RecyclerView.Adapter<myviewholder>
{

ArrayList<datamodel>data;
Context context1;
    public reccrdadapter(ArrayList<datamodel> data, Context context) {
        this.data = data;
        this.context1=context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.singlerow1,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position)
    {
        final datamodel temp=data.get(position);
        holder.t1.setText(data.get(position).getHeader());
        holder.t2.setText(data.get(position).getDescription());
        holder.im1.setImageResource(data.get(position).getImagename());
        String msg=temp.toString();

//        Toast.makeText(context1.getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
        holder.im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent i=new Intent(context1,reccarddata.class);
                    i.putExtra("img",temp.getImagename());
                    i.putExtra("header",temp.getHeader());
                    i.putExtra("desc",temp.getDescription());
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context1.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
       return data.size();
    }
}
