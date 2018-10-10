package com.example.android.firsttask;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void openRegister(View view) {
        startActivity(new Intent(this,Register.class));
    }

    public void openHome(View view) {
        startActivity(new Intent(this,Home.class));

    }
}
