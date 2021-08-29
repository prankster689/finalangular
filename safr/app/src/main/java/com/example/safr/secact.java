package com.example.safr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secact extends AppCompatActivity {

        TextView t1;
        Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secact);

        setTitle("second");
        Intent i=getIntent();
        int a=i.getIntExtra("n1",1);
        int b=i.getIntExtra("n2",1);

        t1.findViewById(R.id.t11);
        b2.findViewById(R.id.button2);
        t1.setText("nos"+a+" "+b);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result=a+b;

                Intent resint=new Intent();
                resint.putExtra("result",result);

                setResult(RESULT_OK,resint);
                finish();

            }
        });
    }
}