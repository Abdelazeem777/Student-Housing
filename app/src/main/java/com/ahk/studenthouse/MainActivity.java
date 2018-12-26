 package com.ahk.studenthouse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.stephentuso.welcome.WelcomeHelper;

 public class MainActivity extends AppCompatActivity {
    WelcomeHelper welcomeScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        welcomeScreen = new WelcomeHelper(this, welcomeActivity.class);
        welcomeScreen.show(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     @Override
     protected void onSaveInstanceState(Bundle outState) {
         super.onSaveInstanceState(outState);
         welcomeScreen.onSaveInstanceState(outState);
     }
}
