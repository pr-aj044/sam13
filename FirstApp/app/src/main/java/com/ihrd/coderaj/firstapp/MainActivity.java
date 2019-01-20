package com.ihrd.coderaj.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.ihrd.coderaj.firstapp.R.id.res;


public class MainActivity extends AppCompatActivity {

    EditText fnum,snum;
    Button b,a;
    EditText txtres;
    String getRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fnum=(EditText)findViewById(R.id.fnum);
        snum=(EditText)findViewById(R.id.snum);
        txtres=(EditText)findViewById(R.id.txtres);
        b=(Button)findViewById(res);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // getFnum=fnum.getText().toString();
                int fn=Integer.parseInt(fnum.getText().toString());
                //getSnum=snum.getText().toString();
                int sn=Integer.parseInt(snum.getText().toString());
                int r=(fn+sn);
                txtres.setVisibility(View.VISIBLE);
                txtres.setText(Integer.toString(r));
                //getRes=Integer.toString(r);//converting integer to string value
                //Toast.makeText(getApplicationContext(),getRes,Toast.LENGTH_SHORT).show();
            }
        });
        a=(Button)findViewById(R.id.nw);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(),"NEXT",Toast.LENGTH_SHORT).show();
                Intent x=new Intent(getApplicationContext(),WelcomeActivity.class);
                startActivity(x);
            }
        });
    }
}