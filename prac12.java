#Java :
package com.vaibhav.pracexams;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnshow);
        ProgressBar progressBar = findViewById(R.id.progress_horizontal);
        EditText editText = findViewById(R.id.edtxt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try {
                    int progress = Integer.parseInt(editText.getText().toString());
                    if (editText.toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "Enter valid value between 0-100", Toast.LENGTH_SHORT).show();
                    }
                    if (progress > 100 || progress < 0) {
                        Toast.makeText(MainActivity.this, "Enter valid value between 0-100", Toast.LENGTH_SHORT).show();
                    } else {
                        progressBar.setProgress(progress);
                    }
                } catch (Exception e){
                    Toast.makeText(MainActivity.this, "Enter valid value between 0-100", Toast.LENGTH_SHORT).show();
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

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter number between (1-100)"
        android:id="@+id/edtxt"
        />
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/btnshow"
        android:text="Show"
        android:layout_gravity="center_horizontal"
        />



    <ProgressBar
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:max="100"
        android:id="@+id/progress_horizontal"
        android:progress="0"
        style="@style/Widget.AppCompat.ProgressBar.Horizontal"
        />

</LinearLayout>
