package com.example.scrollsandcardviewlayou;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myAdapter extends RecyclerView.Adapter<myAdapter.holder>
{
    Context context;
    String data[];

    public myAdapter(String[] data, Context context)
    {
        this.data = data;
        this.context=context;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.singlerow,parent,false);
        return new holder(view);



    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position)
    {
        holder.tv.setText(data[position]);

        holder.tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String dataname=holder.tv.getText().toString();
                Toast.makeText(context.getApplicationContext(), dataname,Toast.LENGTH_SHORT).show();

            }
        });

    }



    @Override
    public int getItemCount() {
        return data.length;
    }


    class holder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView tv;

        public holder(@NonNull View itemView) {
            super(itemView);
            img=(ImageView) itemView.findViewById(R.id.img1);
            tv=(TextView) itemView.findViewById(R.id.t1);

        }


    }
}
