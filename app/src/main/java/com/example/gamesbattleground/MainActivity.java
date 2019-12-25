package com.example.gamesbattleground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("GamesBattleGround");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void goToLogin(View view) {
        Intent gtl=new Intent(MainActivity.this,Login.class);
        startActivity(gtl);
        finish();
    }

    public void goToHome(View view) {
        Intent gth=new Intent(MainActivity.this,MainActivity.class);
        startActivity(gth);
        finish();
    }

    public void goToNoti(View view) {
        Intent gtn=new Intent(MainActivity.this,Notifications.class);
        startActivity(gtn);
        finish();
    }

    public void goToSettings(View view) {
        Intent gts=new Intent(MainActivity.this,Settings.class);
        startActivity(gts);
        finish();

    }

    public void goToProfile(View view) {
        Intent gtp=new Intent(MainActivity.this,Profile.class);
        startActivity(gtp);
        finish();
    }

    public void goToSelectM(View view) {
        Intent gtsm=new Intent(MainActivity.this,SelectMatch.class);
        startActivity(gtsm);
        finish();
    }
}
