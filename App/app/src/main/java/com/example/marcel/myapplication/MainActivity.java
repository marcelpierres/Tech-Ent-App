package com.example.marcel.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button SubmitBtn =(Button) findViewById(R.id.SubmitBtn);
        SubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText FirstNameEditText = (EditText) findViewById(R.id.FirstNameEditText);
                EditText SecondNameEditTest = (EditText) findViewById(R.id.LastNameEditText);

                TextView ResultTextView = (TextView) findViewById(R.id.ResultTextView);

                String name1 = FirstNameEditText.getText().toString();
                String name2 = SecondNameEditTest.getText().toString();

                String result = name1+" "+name2;
                ResultTextView.setText(result);
            }
        });
    }
}
