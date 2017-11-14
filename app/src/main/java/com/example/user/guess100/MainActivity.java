package com.example.user.guess100;

import android.support.v7.app.AlertDialog;
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        Button send =(Button) findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                int num = (int) (Math.random() * 100) + 1;
                Button send = (Button) findViewById(R.id.send);
                TextView info = (TextView) findViewById(R.id.info);
                TextView secret = (TextView) findViewById(R.id.secret);
                EditText number = (EditText) findViewById(R.id.number);
                secret.setText("秘密數字" + String.valueOf(num));
                while (true) {
                    String w = number.getText().toString();
                    int numbernumber = Integer.parseInt(w);
                    if (numbernumber > num) {
                        new AlertDialog.Builder(MainActivity.this)
                                .setMessage(0 + "to" + numbernumber)
                                .show();
                    }
                    if (numbernumber < num) {
                        new AlertDialog.Builder(MainActivity.this)
                                .setMessage(numbernumber + "to" + 100)
                                .show();
                    }
                    if (numbernumber == num) {
                        break;
                    }


                }
            }
        });
        }

}
