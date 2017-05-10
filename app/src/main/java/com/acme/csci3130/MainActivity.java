package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Locate all of our views
        final Button button = (Button) findViewById(R.id.button);
        final TextView textViewReceive = (TextView) findViewById(R.id.helloText);
        final TextView textViewInput = (TextView) findViewById(R.id.editText);

        // Add event listener for button click
        // Template from: https://developer.android.com/reference/android/widget/Button.html
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(textViewInput.length() != 0){
                    textViewReceive.setText(textViewInput.getText());
                }
            }
        });
    }
}
