package com.example.scrollsandcardviewlayou;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

public class recyclerv extends AppCompatActivity {

    RecyclerView rcv;
    myAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerv);

        rcv=findViewById(R.id.rcv);

        rcv.setLayoutManager(new LinearLayoutManager(this));
        String ar[]={"c","c++","python","c","c++","python","c","c++","python"};
        adapter=new myAdapter(ar,getApplicationContext());
        rcv.setAdapter(adapter);

    }
}