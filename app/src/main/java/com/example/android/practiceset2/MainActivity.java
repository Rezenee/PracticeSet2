package com.example.android.practiceset2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE
        displayForTeamA(9);
    }
    int scoreTeamA = 0;


    public void addThreeForTeamA(View v){
        scoreTeamA +=3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTeamA(View v){
        scoreTeamA +=2;
        displayForTeamA(scoreTeamA);
    }
    public void addOneForTeamA(View v){
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
