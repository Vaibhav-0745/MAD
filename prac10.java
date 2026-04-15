#java : 
package com.vaibhav.pracexams;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import com.vaibhav.pracexams.R;

public class MainActivity extends AppCompatActivity {


    Button btnShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cb1 = findViewById(R.id.cbCricket);
        CheckBox cb2 = findViewById(R.id.cbFootball);
        CheckBox cb3 = findViewById(R.id.cbMusic);
        RadioGroup rdgrp = findViewById(R.id.rdgroup);


        btnShow = findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            cb1.setChecked(false);
            cb2.setChecked(false);
            cb3.setChecked(false);
            rdgrp.clearCheck();
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

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Select Your Hobbies"
        android:textSize="20sp"/>

    <CheckBox
        android:id="@+id/cbCricket"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Cricket"/>

    <CheckBox
        android:id="@+id/cbFootball"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Football"/>

    <CheckBox
        android:id="@+id/cbMusic"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Music"/>

    <RadioGroup
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/rdgroup">
        <RadioButton
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Male"
            android:id="@+id/male"
            />
        <RadioButton
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="female"
            android:id="@+id/fmale"/>
    </RadioGroup>
    <Button
        android:id="@+id/btnShow"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Show Selected"
        android:layout_marginTop="15dp"/>



</LinearLayout>
