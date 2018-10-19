package com.example.asus.coutconter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA = 0;
    int scoreB = 0;

    public void plusTroisA(View v) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void plusDeuxA(View v) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void freeThrowA(View v) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void plusTroisB(View v) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void plusDeuxB(View v) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void freeThrowB(View v) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    public void reset(View v) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
