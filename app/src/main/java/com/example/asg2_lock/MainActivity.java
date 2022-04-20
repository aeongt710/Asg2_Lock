package com.example.asg2_lock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String _password;
    TextView _passTV;
    int _invalidCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _passTV =findViewById(R.id.main_tv_pass);
        _password ="0000";
        _invalidCount=1;
        btnFunctions();
    }
    public void btnFunctions()
    {
        findViewById(R.id.main_btn_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updatePasscode("0");
            }
        });
        findViewById(R.id.main_btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updatePasscode("1");
            }
        });
        findViewById(R.id.main_btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updatePasscode("2");
            }
        });
        findViewById(R.id.main_btn_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updatePasscode("3");
            }
        });
        findViewById(R.id.main_btn_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updatePasscode("4");
            }
        });
        findViewById(R.id.main_btn_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updatePasscode("5");
            }
        });
        findViewById(R.id.main_btn_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updatePasscode("6");
            }
        });
        findViewById(R.id.main_btn_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updatePasscode("7");
            }
        });
        findViewById(R.id.main_btn_8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updatePasscode("8");
            }
        });
        findViewById(R.id.main_btn_9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updatePasscode("9");
            }
        });
        findViewById(R.id.main_btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(_passTV.getText().toString().length()>0)
                {
                    _passTV.setText(_passTV.getText().toString().substring(0, _passTV.getText().toString().length()-1));
                }
            }
        });
        findViewById(R.id.main_btn_open).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(_passTV.getText().toString().equals(_password))
                {
                    Toast.makeText(getApplicationContext(), R.string.success, Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity.this,SuccessActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Invalid Passcode!", Toast.LENGTH_SHORT).show();
                    if(_invalidCount==3)
                    {
                        finish();
                    }else{
                        _invalidCount++;
                    }
                }
            }
        });
    }
    public void updatePasscode(String input)
    {
        if(_passTV.getText().toString().length()<4)
        {
            _passTV.setText(_passTV.getText().toString()+input);
        }else{
            Toast.makeText(this, "Max Length Reached!", Toast.LENGTH_SHORT).show();
        }
    }
}