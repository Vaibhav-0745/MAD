#Java
package com.vaibhav.pracexams;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.vaibhav.pracexams.R;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btnShow;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       editText = findViewById(R.id.editText);
       btnShow = findViewById(R.id.btnShow);
       textView = findViewById(R.id.textView);

       btnShow.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String mssg = editText.getText().toString();
               textView.setText(mssg);
           }
       });

    }
}

#XML
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp">

    <EditText
        android:id="@+id/editText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter something"/>

    <Button
        android:id="@+id/btnShow"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Show Text"
        android:layout_marginTop="10dp"/>

    <TextView
        android:id="@+id/textView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Output will appear here"
        android:textSize="18sp"
        android:layout_marginTop="20dp"/>

</LinearLayout>
