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
        List<String> contentsList = new ArrayList<>();
        contentsList.add(contents);

        switch (contents.charAt(0)) {
            case 'a':
                displayTV.setText("Pig Latin: " + contents + "way");
                break;

            case 'e':
                displayTV.setText("Pig Latin: " + contents + "way");
                break;

            case 'i':
                displayTV.setText("Pig Latin: " + contents + "way");
                break;

            case 'o':
                displayTV.setText("Pig Latin: " + contents + "way");
                break;

            case 'u':
                displayTV.setText("Pig Latin: " + contents + "way");
                break;

            default:

                break;
        }


    }
}
