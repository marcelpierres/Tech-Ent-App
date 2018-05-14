package com.example.marcel.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Launch Activity Within App
        // Create Button object and Refer to button by ID
        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);

        //Create a button click event listener
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to go to Second Activity
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);

                //show how to pass information to second activity
                startIntent.putExtra("com.example.marcel.quicklauncher.SOMETHING", "HELLO WORLD!");

                //Starts Activity and sends intent
                startActivity(startIntent);

            }
        });


        // Attempt to launch and activity outside our App

        // have app go to webpage on button click

        Button googleBtn = (Button) findViewById(R.id.googleBtn);

        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String google = "http://www.google.com";
                Uri webaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);

                if (gotoGoogle.resolveActivity(getPackageManager()) != null){

                    startActivity(gotoGoogle);
                }
            }

        });


    }
}
