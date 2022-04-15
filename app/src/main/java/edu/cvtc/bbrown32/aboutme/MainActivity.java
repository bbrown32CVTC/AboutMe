package edu.cvtc.bbrown32.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String aboutMe;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sets the text for about_me_textView
        aboutMe = "Hi, my name is Bruce Brown. My family and friends call me by middle" +
                " name, which is Adam. I enjoy spending time with friends and family, making" +
                " music, fishing, grilling, being creative, and playing video games. There’s " +
                "a lot more to know about me, so feel free to click on the pictures to get to " +
                "know more about me!";

        // Assigns textView to the about_me_textView TextView by ID
        textView = findViewById(R.id.about_me_textView);

        // Sets the text for the about_me_textView widget
        textView.setText(aboutMe);
    }

    // Creates the menu in the action bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Goes to the activity selected in the menu
        switch (item.getItemId()) {
            case R.id.action_about_me:
                // Creates the intent and starts the activity
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                return true;
            case R.id.action_about_artistry:
                // Creates the intent and starts the activity
                startActivity(new Intent(getApplicationContext(), ArtistryActivity.class));
                return true;
            case R.id.action_about_family:
                // Creates the intent and starts the activity
                startActivity(new Intent(getApplicationContext(), FamilyActivity.class));
                return true;
            default:
                // Do nothing
        }

        return super.onOptionsItemSelected(item);
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