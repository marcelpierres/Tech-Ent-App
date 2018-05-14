package com.example.marcel.quicklauncher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // If there is intent from this Key name
        if (getIntent().hasExtra("com.example.marcel.quicklauncher.SOMETHING")){

            //Create a TextView object and Refer to Object by existing ID
            TextView tv = (TextView) findViewById(R.id.textView);

            // Get the value from the Intent that has been passed
            String text = getIntent().getExtras().getString("com.example.marcel.quicklauncher.SOMETHING");

            // set the value to the Text View
            tv.setText(text);
        }

    }
}
