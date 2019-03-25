package com.tharuneniyan.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button threePointsButton,threePointsButtonB;
    Button twoPointsButton,twoPointsButtonB;
    Button onePointsButton,onePointsButtonB;
    int  scoreTeamA = 0;
    int  scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);

        threePointsButton = findViewById(R.id.threePointsButtonA);
        twoPointsButton = findViewById(R.id.twoPointsButtonA);
        onePointsButton = findViewById(R.id.onePointsButtonA);

        threePointsButtonB = findViewById(R.id.threePointsButtonB);
        twoPointsButtonB = findViewById(R.id.twoPointsButtonB);
        onePointsButtonB = findViewById(R.id.onePointsButtonB);

        threePointsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 3;
                displayForTeamA(scoreTeamA);
            }
        });

        twoPointsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 2;
                displayForTeamA(scoreTeamA);
            }
        });

        onePointsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 1;
                displayForTeamA(scoreTeamA);
            }
        });

        threePointsButtonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 3;
                displayForTeamB(scoreTeamB);
            }
        });

        twoPointsButtonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 2;
                displayForTeamB(scoreTeamB);
            }
        });

        onePointsButtonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 1;
                displayForTeamB(scoreTeamB);
            }
        });


    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
