#Java : 

package com.vaibhav.pracexams;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
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

        ImageButton img = findViewById(R.id.imgbtn);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Image Button Clicked", Toast.LENGTH_SHORT).show();
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




    <ImageButton
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:src="@drawable/img"
        android:contentDescription="Image btn"
        android:id="@+id/imgbtn"
        />



</LinearLayout>
