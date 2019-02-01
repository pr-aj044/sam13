package com.ihrd.coderaj.read4me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText fnm,lnm,age,mob,mail,pswd1,cmpswd;
    Button signup;
    Spinner gen;
    String fname,lname,uage,gender,mobile,email,passwd,cmpasswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fnm=(EditText)findViewById(R.id.fnm);
        lnm=(EditText)findViewById(R.id.lnm);
        age=(EditText)findViewById(R.id.age);
        gen=(Spinner)findViewById(R.id.spin1);
        mob=(EditText)findViewById(R.id.mob);
        mail=(EditText)findViewById(R.id.mail);
        pswd1=(EditText)findViewById(R.id.pswd1);
        cmpswd=(EditText)findViewById(R.id.cmpswd);
        signup=(Button) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fname=fnm.getText().toString();
                lname=lnm.getText().toString();
                uage=age.getText().toString();
                gender=gen.getSelectedItem().toString();
                mobile=mob.getText().toString();
                email=mail.getText().toString();
                passwd=pswd1.getText().toString();
                cmpasswd=cmpswd.getText().toString();
                if(passwd.equals(cmpasswd)){
                    //rest of prgrm
                    Toast.makeText(getApplicationContext(),"signup success",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
