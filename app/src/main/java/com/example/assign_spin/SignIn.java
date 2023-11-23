package com.example.assign_spin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    EditText edtTxtName,edtTxtEmail,edtTxtPassword,edtTxtReferralCode;
    TextView txtSignIn;
    ImageView imgGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
}