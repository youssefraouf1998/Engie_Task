package com.example.android.firsttask;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void openHome(View view) {
        startActivity(new Intent(this,Home.class));

    }
    /*public void openFacebook(View view) {
        String facebookPageID = "dempagumi.inc";
        String facebookUrl = "https://www.facebook.com/" + facebookPageID;

        String facebookUrlScheme = "fb://page/" + facebookPageID;

        try {
            int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;

            if (versionCode >= 3002850) {
                Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            } else {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrlScheme)));
            }
        } catch (PackageManager.NameNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
        }
    }
    public void openGmail(View view) {
        Intent open=new Intent(Intent.ACTION_SEND);
        startActivity(open);
    }
    */
}
