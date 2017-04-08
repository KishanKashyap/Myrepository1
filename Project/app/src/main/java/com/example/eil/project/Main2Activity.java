package com.example.eil.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText et;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et=(EditText)findViewById(R.id.password);

            btn=(Button)findViewById(R.id.button);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(Integer.valueOf(et.getText().toString())>50&&Integer.valueOf(et.getText().toString())<500){
                    Intent intent =new Intent(Main2Activity.this,menu.class);
                    startActivity(intent);
                }
                else
                        Toast.makeText(Main2Activity.this,"Sorry,Incorrect Username",Toast.LENGTH_SHORT).show();}
            });

        }


    }


