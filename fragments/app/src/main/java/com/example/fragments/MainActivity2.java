package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.DateFormatSymbols;

public class MainActivity2 extends AppCompatActivity {
    Spinner s1,s2;
    Button b1;
    String[] months;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        s1=findViewById(R.id.spinner1);
        s2=findViewById(R.id.spinner2);
        b1=findViewById(R.id.button1);

        populates1();
        populates2();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String month =s1.getSelectedItem().toString();
                String year=s2.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),month+""+year,Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void populates1()
    {
        months=new DateFormatSymbols().getMonths();
        ArrayAdapter<String>MonthAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,months);
        MonthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(MonthAdapter);

    }

    private void populates2()
    {
        ArrayAdapter<String> yearAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.spinner_year));
        yearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(yearAdapter);
    }
}