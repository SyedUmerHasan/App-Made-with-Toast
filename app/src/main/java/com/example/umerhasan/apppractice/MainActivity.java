package com.example.umerhasan.apppractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button yesButton;
    private Button noButton;
    private EditText userName;
    private Toast myToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yesButton = findViewById(R.id.yes);
        noButton = findViewById(R.id.no);
        userName = findViewById(R.id.userName);
        myToast = Toast.makeText(getApplicationContext(), null, Toast.LENGTH_SHORT);
    }

    public void yesLoveYou(View view) {
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = userName.getText().toString();
                String myString = "Yes, " + name + " I love you <3 ";
                myToast.setText(myString);
                myToast.show();
            }
        });
    }

    public void NoLoveYou(View view) {
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = userName.getText().toString();
                String myString = "Yes, but " + name + " I love you as a friend";
                myToast.setText(myString);
                myToast.show();
            }
        });
    }
}
