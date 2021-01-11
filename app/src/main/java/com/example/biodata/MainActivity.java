package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telepon (View view) {
        Uri uri = Uri.parse("tel:+6281326676678");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void maps (View view) {
        Uri uri = Uri.parse("geo:-7.00128087835027, 110.33969713200291");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void email (View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"hello.luthfimuh@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Hello Buddy");

        try {
            startActivity(Intent.createChooser(intent, "Want To Sent A Message?"));
        } catch (android.content.ActivityNotFoundException ignored) {
        }
    }
}