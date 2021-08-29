package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button b1;
EditText e1;
TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button);
        e1=findViewById(R.id.e1);
        t1=findViewById(R.id.txt);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg=e1.getText().toString();

                SharedPreferences shrd=getSharedPreferences("demo",MODE_PRIVATE);

                SharedPreferences.Editor editor=shrd.edit();

                editor.putString("str",msg);
                editor.apply();
                t1.setText(msg);


            }
        });

        SharedPreferences getshared= getSharedPreferences("demo",MODE_PRIVATE);
        String value=getshared.getString("str","defvals");
        t1.setText(value);
    }
}