package com.ahk.studenthouse;

import android.content.Intent;

import com.stephentuso.welcome.BasicPage;
import com.stephentuso.welcome.TitlePage;
import com.stephentuso.welcome.WelcomeActivity;
import com.stephentuso.welcome.WelcomeConfiguration;

public class welcomeActivity extends WelcomeActivity {
    @Override
    protected WelcomeConfiguration configuration() {
        return new WelcomeConfiguration.Builder(this)
                .defaultBackgroundColor(R.color.colorPrimary)
                .page(new TitlePage(R.drawable.kfs_logo,
                        "Welcome to\n\n Kafr Elsheikh University\n\n Student Housing")

                )
                .swipeToDismiss(false)
                .bottomLayout(WelcomeConfiguration.BottomLayout.BUTTON_BAR)
                .canSkip(false)
                .backButtonSkips(false)
                .showActionBarBackButton(false)
                .backButtonNavigatesPages(false)
                .build();
    }

    @Override
    protected void onButtonBarFirstPressed() {
        Intent n=new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(n);
    }

    @Override
    protected void onButtonBarSecondPressed() {
        Intent n=new Intent(getApplicationContext(),RegisterActivity.class);
        startActivity(n);
    }
}
