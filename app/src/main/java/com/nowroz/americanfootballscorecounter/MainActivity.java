package com.nowroz.americanfootballscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method adds 6 points to Team A
     * @param view
     */
    public void addSixPointsTeamA(View view){
        scoreTeamA += 6;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * This method adds 6 points to Team B
     * @param view
     */
    public void addSixPointsTeamB(View view){
        scoreTeamB += 6;
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * This method adds 3 points to Team A
     * @param view
     */
    public void addThreePointsTeamA(View view){
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * This method adds 3 points to Team B
     * @param view
     */
    public void addThreePointsTeamB(View view){
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * This method adds 2 points to Team A
     * @param view
     */
    public void addTwoPointsTeamA(View view){
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * This method adds 2 points to Team B
     * @param view
     */
    public void addTwoPointsTeamB(View view){
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * This method adds 1 point to Team A
     * @param view
     */
    public void addOnePointTeamA(View view){
        scoreTeamA += 1;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * This method adds 1 point to Team B
     * @param view
     */
    public void addOnePointTeamB(View view){
        scoreTeamB += 1;
        displayScoreTeamB(scoreTeamB);
    }

    public void resetScores(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * This method displays score of Team A
     * @param scoreTeamA an integer denoting the score of Team A
     */
    private void displayScoreTeamA(int scoreTeamA){
        TextView scoreTeamATextView = (TextView)findViewById(R.id.score_team_a_text_view);
        scoreTeamATextView.setText(""+scoreTeamA);
    }

    /**
     * This method displays score of Team B
     * @param scoreTeamB an integer denoting the score of Team B
     */
    private void displayScoreTeamB(int scoreTeamB){
        TextView scoreTeamATextView = (TextView)findViewById(R.id.score_team_b_text_view);
        scoreTeamATextView.setText(""+scoreTeamB);
    }
}
