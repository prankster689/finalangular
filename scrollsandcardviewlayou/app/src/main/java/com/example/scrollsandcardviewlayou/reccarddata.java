package com.example.scrollsandcardviewlayou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class reccarddata extends AppCompatActivity {
ImageView i;
TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reccarddata);

         i=findViewById(R.id.rimg);
         t1=findViewById(R.id.rt1);
         t2=findViewById(R.id.rt2);

         i.setImageResource(getIntent().getIntExtra("img",0));
         t1.setText(getIntent().getStringExtra("header"));
        t2.setText(getIntent().getStringExtra("desc"));
    }
}