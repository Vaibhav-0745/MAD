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


        ToggleButton tgbtn = findViewById(R.id.tgbtn);
        TextView txt = findViewById(R.id.txt);
        tgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tgbtn.isChecked()){
                    Toast.makeText(MainActivity.this,"Toggle Button On", Toast.LENGTH_SHORT).show();
                    txt.setText("Toggle Button On");
                }
                else{
                    Toast.makeText(MainActivity.this,"Toggle Button Off", Toast.LENGTH_SHORT).show();
                    txt.setText("Toggle button off ");
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



   <TextView
       android:layout_width="match_parent"
       android:layout_height="wrap_content"
       android:text="Toggle Button"
        android:id="@+id/txt"/>
    <ToggleButton
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textOff="btn off"
        android:textOn="btnon"
        android:id="@+id/tgbtn"
        />


</LinearLayout>
