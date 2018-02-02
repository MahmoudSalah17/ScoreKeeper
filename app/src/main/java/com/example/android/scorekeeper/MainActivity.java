package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAgoals = 0;
    int teamAyellow = 0;
    int teamAred = 0;
    int teamBgoals = 0;
    int teamByellow = 0;
    int teamBred = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goalA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowCardsA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayRedForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redCardsA);
        scoreView.setText(String.valueOf(score));
    }
    public void teamAscores(View view)
    {
        teamAgoals++;
        displayGoalForTeamA(teamAgoals);
    }

    public void teamAyellow(View view)
    {
        teamAyellow++;
        displayYellowForTeamA(teamAyellow);
    }

    public void teamAred(View view)
    {
        teamAred++;
        displayRedForTeamA(teamAred);
    }

    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goalB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowCardsB);
        scoreView.setText(String.valueOf(score));
    }
    public void displayRedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redCardsB);
        scoreView.setText(String.valueOf(score));
    }
    public void teamBscores(View view)
    {
        teamBgoals++;
        displayGoalForTeamB(teamBgoals);
    }

    public void teamByellow(View view)
    {
        teamByellow++;
        displayYellowForTeamB(teamByellow);
    }

    public void teamBred(View view)
    {
        teamBred++;
        displayRedForTeamB(teamBred);
    }

    public void reset(View view)
    {
        teamAgoals = 0;
        teamAyellow = 0;
        teamAred = 0;
        teamBgoals = 0;
        teamByellow = 0;
        teamBred = 0;
        displayGoalForTeamA(teamAgoals);
        displayYellowForTeamA(teamAyellow);
        displayRedForTeamA(teamAred);
        displayGoalForTeamB(teamBgoals);
        displayYellowForTeamB(teamByellow);
        displayRedForTeamB(teamBred);
    }
}
