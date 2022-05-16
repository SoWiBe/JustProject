package com.example.bangladeshactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignInActivity extends AppCompatActivity {


    private CardView cardResident, cardEnter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        cardResident = findViewById(R.id.cardResidentSignIn);
        cardEnter = findViewById(R.id.cardEnterHouseSignIn);

        cardResident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
                finish();
            }
        });

        cardEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //enter to mainactivity)))))
                startActivity(new Intent(SignInActivity.this, MainActivity.class));
                finish();
            }
        });
    }
}