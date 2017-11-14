package com.example.user.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void findViews(){
        Button send =(Button) findViewById(R.id.send);
        EditText number =(EditText) findViewById(R.id.number);
        TextView info= (TextView) findViewById(R.id.info);
        TextView secret= (TextView) findViewById(R.id.secret);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
          findViews();




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
