package com.example.android.miwok;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private static final String LOG_TAG = NumbersActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        /*
        //Create an array of words
        String[] words = new String[10];

        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        Log.v(LOG_TAG, "Word at index 0: " + words[0]);
        Log.v(LOG_TAG, "Word at index 1: " + words[1]);
        Log.v(LOG_TAG, "Word at index 2: " + words[2]);
        Log.v(LOG_TAG, "Word at index 3: " + words[3]);
        Log.v(LOG_TAG, "Word at index 4: " + words[4]);
        Log.v(LOG_TAG, "Word at index 5: " + words[5]);
        Log.v(LOG_TAG, "Word at index 6: " + words[6]);
        Log.v(LOG_TAG, "Word at index 7: " + words[7]);
        Log.v(LOG_TAG, "Word at index 8: " + words[8]);
        Log.v(LOG_TAG, "Word at index 9: " + words[9]);
        */

        //Create an ArrayList of words
        ArrayList<String> words = new ArrayList<String>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        LinearLayout rootView = findViewById(R.id.rootView);

        int index = 0;

        TextView wordView = new TextView(this);
        wordView.setText(words.get(index));
        rootView.addView(wordView);

        index += 1;

        TextView wordView2 = new TextView(this);
        wordView2.setText(words.get(index));
        rootView.addView(wordView2);

        index += 1;

        TextView wordView3 = new TextView(this);
        wordView3.setText(words.get(index));
        rootView.addView(wordView3);
    }
}

