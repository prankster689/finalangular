package com.example.firstempty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=findViewById(R.id.username);
        ed2=findViewById(R.id.password);
        b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                if(ed1.getText().toString().equals("admin") && ed2.getText().toString().equals("admin"))
                {
                    Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"no success",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}