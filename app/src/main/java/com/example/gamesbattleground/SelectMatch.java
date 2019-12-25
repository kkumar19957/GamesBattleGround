package com.example.gamesbattleground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectMatch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_match);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Select Match Type");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void goToSolo(View view) {
        Intent gtsolo=new Intent(SelectMatch.this,SoloMatch.class);
        startActivity(gtsolo);
        finish();
    }

    public void goToDuo(View view) {
        Intent gtduo=new Intent(SelectMatch.this,DuoMatch.class);
        startActivity(gtduo);
        finish();
    }

    public void goToSquad(View view) {
        Intent gtsquad=new Intent(SelectMatch.this,SquadMatch.class);
        startActivity(gtsquad);
        finish();
    }
}
