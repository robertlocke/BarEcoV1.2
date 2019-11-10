package com.example.barecov1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //code for switching activities https://www.youtube.com/watch?v=bgIUdb-7Rqo

    //declaring variables to assign to elements
    private TextView register;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connecting variables and elements by id
        register = (TextView) findViewById(R.id.registerLink);
         login = (Button) findViewById(R.id.btnLogin);

         //Giving actions to the variables when they are clicked
         register.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 openRegisterActivity();
             }
         });
         login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });
    }

    //Opens the register activity
    public void openRegisterActivity(){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    //Opens the Home activity
    public void openHomeActivity(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

}
