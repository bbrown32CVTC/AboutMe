package edu.cvtc.bbrown32.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ArtistryActivity extends AppCompatActivity {

    public String aboutArtistry;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artistry);

        // Sets the text for about_artistry_textView
        aboutArtistry = "I am an independent hip hop artist and songwriter that goes by the " +
                "stage name of Cudlino. My music has been listened to in almost every country, " +
                "and I have over 100,000 streams collaboratively between all music streaming " +
                "platforms and websites.. I have  shared the stage with national and regional " +
                "touring artists iYaz, Lil Flip, Project Pat, Absent, Krayzie Bone from Bone " +
                "Thugs N’ Harmony, Denim White, and DJ Abilities of Rhymesayers. My catalog " +
                "consists of  an album, two EPs, multiple singles, and three mixtapes.";

        // Assigns textView to the about_artistry_textView TextView by ID
        textView = findViewById(R.id.about_artistry_textView);

        // Sets the text for the about_artistry_textView widget
        textView.setText(aboutArtistry);
    }

    /**
     * Takes the user to the Family activity after clicking the image
     */
    public void launchFamilyActivity(View view) {

        // Display the toast for testing purposes
        displayToast(getString(R.string.family_label_text));

        // Creates the intent and starts the activity
        startActivity(new Intent(getApplicationContext(), FamilyActivity.class));
    }

    /**
     * Takes the user to the About Me activity after clicking the image
     */
    public void launchAboutMeActivity(View view) {

        // Display the toast for testing purposes
        displayToast(getString(R.string.about_me_label_text));

        // Creates the intent and starts the activity
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    /**
     * Displays a toast message
     */
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}