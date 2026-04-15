#Java
package com.vaibhav.pracexams;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup radioGroup, int i) {

                // Reset colors
                rb1.setTextColor(Color.BLACK);
                rb2.setTextColor(Color.BLACK);

                // Change selected color
                if (rb1.isChecked()) {
                    rb1.setTextColor(Color.RED);
                }
                if (rb2.isChecked()) {
                    rb2.setTextColor(Color.RED);
                }
            }
        });
    }
}

#XML : 
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp">

    <RadioGroup
        android:id="@+id/radioGroup"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

        <RadioButton
            android:id="@+id/rb1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Option 1"/>

        <RadioButton
            android:id="@+id/rb2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Option 2"/>

    </RadioGroup>

</LinearLayout>
