
package com.example.safr;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        EditText t1,t2;
       TextView r1;
       Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.t1);
        t2=findViewById((R.id.t2));

        r1=findViewById(R.id.r1);
        button1=findViewById(R.id.button1);

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int n1=Integer.parseInt(t1.getText().toString());
                    int n2=Integer.parseInt(t2.getText().toString());

                    Intent i=new Intent(getApplicationContext(),secact.class);
                    i.putExtra("n1",n1);
                    i.putExtra("n2",n2);
                    startActivityForResult(i,1);
                }
            });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==1)
        {
            if(resultCode==RESULT_OK)
            {
                int result= data.getIntExtra("result",0);
                r1.setText(""+result);
            }
            if(resultCode==RESULT_CANCELED)
            {
                r1.setText("NOTHING");
            }
        }
    }
}