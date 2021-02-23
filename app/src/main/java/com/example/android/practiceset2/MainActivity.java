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

    /**
     * Displays the given score for Team A.
     */

    public void addThreeForTeamA(View v){
        displayForTeamA(3);
    }
    public void addTwoForTeamA(View v){
        displayForTeamA(2);
    }
    public void addOneForTeamA(View v){
        displayForTeamA(1);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
