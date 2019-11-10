package com.example.barecov1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    //declaring variables to correspond to elements
    private Button scan;
    private Button history;
    private Button feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //connecting variables to elements by id
        scan = (Button) findViewById(R.id.btnScan);
        history = (Button) findViewById(R.id.btnHistory);
        feedback = (Button) findViewById(R.id.btnFeedback);

        //Giving actions to the variables when they are clicked
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScanner();
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHistory();
            }
        });
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFeedback();
            }
        });

    }

    //Opens the Scan activity
    public void openScanner(){
        Intent intent = new Intent(this, ScanActivity.class);
        startActivity(intent);
    }
    //Opens the History activity
    public void openHistory(){
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }
    //Opens the feedback activity
    public void openFeedback(){
        Intent intent = new Intent(this, FeedbackActivity.class);
        startActivity(intent);
    }
}
