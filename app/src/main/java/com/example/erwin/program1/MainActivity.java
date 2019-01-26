package com.example.erwin.program1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayClick(View v) {
        Log.d("click", "convert BTN was clicked");
        TextView displayTV = findViewById(R.id.displayTV);
        EditText displayET = findViewById(R.id.displayET);
        String contents = displayET.getText().toString();

        char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u';
        int start = 0, firstVowel = 0, end = contents.length();


        for(int x = 0; x < end; x++) {
            char c = Character.toLowerCase(contents.charAt(x));
            if(c == a || c == e || c == i || c == o || c == u) {
                firstVowel = x;
                break;
            }
        }

        if(start != firstVowel) {
            String startString = contents.substring(firstVowel, end);
            String endString = contents.substring(start, firstVowel) + "ay";
            String finalString = startString + endString;
            displayTV.setText("Pig Latin: " + finalString);
        }

        else {
            displayTV.setText("Pig Latin: " + contents + "way");
        }
    }

    public void displayClickClear(View v) {
        Log.d("click", "clear BTN was clicked");
        TextView displayTV = findViewById(R.id.displayTV);
        EditText displayET = findViewById(R.id.displayET);
        displayTV.setText("Pig Latin: ");
        displayET.setText("");
    }


}
