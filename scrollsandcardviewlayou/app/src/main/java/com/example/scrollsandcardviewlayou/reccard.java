package com.example.scrollsandcardviewlayou;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class reccard extends AppCompatActivity {
RecyclerView rec;
    reccrdadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reccard);
        Log.i("tag2", "onCreate: Hello World!");
        rec=findViewById(R.id.rec);


//        rec.setLayoutManager(new LinearLayoutManager(this));
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rec.setLayoutManager(gridLayoutManager);

         adapter=new reccrdadapter(dq(),getApplicationContext());
         rec.setAdapter(adapter);
    }

    public ArrayList<datamodel>dq()
    {
        Log.d("myTag", "This is my message");
        ArrayList<datamodel>hold=new ArrayList<>();

        datamodel ob1=new datamodel();
        ob1.setHeader("A");
        ob1.setDescription("first");
        ob1.setImagename(R.drawable.img1);
        hold.add(ob1);

        datamodel ob2=new datamodel();
        ob2.setHeader("B");
        ob2.setDescription("first");
        ob2.setImagename(R.drawable.img1);
        hold.add(ob2);


        datamodel ob3=new datamodel();
        ob3.setHeader("C  ");
        ob3.setDescription("first");
        ob3.setImagename(R.drawable.img1);
        hold.add(ob3);

        datamodel ob4=new datamodel();
        ob4.setHeader("D");
        ob4.setDescription("first");
        ob4.setImagename(R.drawable.img1);
        hold.add(ob4);

        datamodel ob5=new datamodel();
        ob5.setHeader("E  prog");
        ob5.setDescription("first");
        ob5.setImagename(R.drawable.img1);
        hold.add(ob5);

        datamodel ob6=new datamodel();
        ob6.setHeader("F  prog");
        ob6.setDescription("first");
        ob6.setImagename(R.drawable.img1);
        hold.add(ob6);

        datamodel ob7=new datamodel();
        ob7.setHeader("G  prog");
        ob7.setDescription("first");
        ob7.setImagename(R.drawable.img1);
        hold.add(ob7);

        datamodel ob8=new datamodel();
        ob8.setHeader("H  prog");
        ob8.setDescription("first");
        ob8.setImagename(R.drawable.img1);
        hold.add(ob8);

        return hold;
    }
}