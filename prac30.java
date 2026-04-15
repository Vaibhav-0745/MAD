📱 1. XML Layout (activity_main.xml)
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical">

    <Button
        android:id="@+id/btnDial"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Open Dialer"/>

</LinearLayout>
☕ 2. Java Code (MainActivity.java)
package com.vaibhav.pracexams;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDial = findViewById(R.id.btnDial);

        btnDial.setOnClickListener(v -> {

            // Implicit Intent to open Dialer
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:")); // empty opens dialer

            startActivity(intent);
        });
    }
}
