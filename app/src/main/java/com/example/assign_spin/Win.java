package com.example.assign_spin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Win extends AppCompatActivity {
    Button btnCorrectAnswer,btnIncorrectAnswer,btntDiamonds,btnEarnCoin,btnPlayAgain,btnRating,btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
    }
}