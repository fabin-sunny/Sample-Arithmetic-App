package com.example.arithmeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LarPage extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lar_page);
        ed1=(EditText) findViewById(R.id.onenum);
        ed2=(EditText) findViewById(R.id.twonum);
        b1=(AppCompatButton) findViewById(R.id.check);
        b2=(AppCompatButton) findViewById(R.id.gotomenu);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int n1 = Integer.parseInt(ed1.getText().toString());
                    int n2 = Integer.parseInt(ed2.getText().toString());
                    if(n1>n2){
                        Toast.makeText(getApplicationContext(),String.valueOf(n1)+" is Largest", Toast.LENGTH_SHORT).show();
                    } else if(n2>n1) {
                        Toast.makeText(getApplicationContext(),String.valueOf(n2)+" is Largest", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Numbers are equal", Toast.LENGTH_SHORT).show();
                    }

                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Enter the numbers", Toast.LENGTH_SHORT).show();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}