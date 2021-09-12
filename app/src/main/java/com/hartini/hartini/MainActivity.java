package com.hartini.hartini;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openIG(View view) {
        String url = ("https://www.instagram.com/nhyharti/=");
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setPackage("com.instagram");
        i.setData(Uri.parse(url));
        startActivity(i);

    }
}
