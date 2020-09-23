package com.example.myfirstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void sendNow(View view)
    {
        Toast.makeText(this, "Sending data from app", Toast.LENGTH_SHORT).show();
    }    public void recieveNow(View view)
    {
        Toast.makeText(this, "receiving data from app", Toast.LENGTH_SHORT).show();
    }    public void resendNow(View view)
    {
        Toast.makeText(this, "resending data from app", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}