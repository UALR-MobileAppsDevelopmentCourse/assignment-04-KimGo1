package com.ualr.resources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button; //need to import Button class

// TODO 3: Define the alternative resources needed to have different content and look n feel depending on the device language.
// TODO 4: Get the description string value from resources
// TODO 5: Initialize the text property of the TextView element with the "country_description_text" id by using the value retrieved in the previous TODO point

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the lesson_learnt_button by its ID
        Button lessonLearntButton = findViewById(R.id.lesson_learnt_button);

        // Set the text for the lessonLearntButton using the string resource
        lessonLearntButton.setText(getString(R.string.lesson_learnt_button_text));
    }
}



