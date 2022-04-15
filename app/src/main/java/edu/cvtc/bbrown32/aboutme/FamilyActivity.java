package edu.cvtc.bbrown32.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FamilyActivity extends AppCompatActivity {

    public String aboutFamily;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        // Sets the text for about_family_textView
        aboutFamily = "I have a wife and two sons. Their names are Kelsey, Adam, and Luca. " +
                "Adam is five and Luca is three. They both enjoy playing outside, running around" +
                ", and playing games. We all enjoy fishing on the boat and going to the beach " +
                "during the summer.";

        // Assigns textView to the about_family_textView TextView by ID
        textView = findViewById(R.id.about_family_textView);

        // Sets the text for the about_family_textView widget
        textView.setText(aboutFamily);
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
     * Takes the user to the Artistry activity after clicking the image
     */
    public void launchArtistryActivity(View view) {

        // Display the toast for testing purposes
        displayToast(getString(R.string.artistry_label_text));

        // Creates the intent and starts the activity
        startActivity(new Intent(getApplicationContext(), ArtistryActivity.class));

    }

    /**
     * Displays a toast message
     */
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}