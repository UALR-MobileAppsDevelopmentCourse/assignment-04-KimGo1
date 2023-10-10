package com.ualr.resources;

import static android.provider.Settings.System.getConfiguration;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; //need to import Button class
import android.widget.ImageView;
import android.widget.TextView; // Import TextView class

import com.ualr.resources.databinding.ActivityMainBinding;

// TODO 3: Define the alternative resources needed to have different content and look n feel depending on the device language.
// TODO 4: Get the description string value from resources
// TODO 5: Initialize the text property of the TextView element with the "country_description_text" id by using the value retrieved in the previous TODO point

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);

        // Set a new source image for the ImageView

        activityMainBinding.svgImageView.setImageResource(R.drawable.spain);

        // Set a new text for the TextView with the new task description
        int setTaskDescription = R.string.country_description_es;
        activityMainBinding.countryDescriptionText.setText(setTaskDescription);

        // Get the actual color value
        Resources res = this.getResources();
        activityMainBinding.countryDescriptionText.setTextColor(res.getColor(R.color.colorAccent));


        activityMainBinding.usaImageView.setImageResource(R.drawable.usa_bitmap);

        // Set an OnClickListener on the Button
        activityMainBinding.lessonLearntButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        // Get the current locale of the device
        Locale currentLocale = getResources().getConfiguration().locale;

        // Define the Spanish locale
        Locale spanishLocale = new Locale("es"); // "es" represents the Spanish language


        String description = getString(R.string.country_description_default); //Default language
        if (currentLocale.equals(spanishLocale)) {
            description = getString(R.string.country_description_es); // Spanish language
        } else {
            // Default to another English language
        }

        activityMainBinding.countryDescriptionText.setText(description);

        // Set the text for the lessonLearntButton using the string resource
        activityMainBinding.lessonLearntButton.setText(getString(R.string.lesson_learnt_button_text));

            }
}



