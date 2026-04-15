#java : 
package com.vaibhav.pracexams;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView tvTime;
    Button btnPickTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTime = findViewById(R.id.tvTime);
        btnPickTime = findViewById(R.id.btnPickTime);

        btnPickTime.setOnClickListener(v -> {

            // Get current time
            Calendar calendar = Calendar.getInstance();
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int minute = calendar.get(Calendar.MINUTE);

            // Create TimePickerDialog
            TimePickerDialog timePickerDialog = new TimePickerDialog(
                    MainActivity.this,
                    (view, selectedHour, selectedMinute) -> {

                        String time = selectedHour + ":" + selectedMinute;
                        tvTime.setText(time);
                    },
                    hour, minute, true // true = 24-hour format
            );

            timePickerDialog.show();
        });
    }
}
#XML : 
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    android:gravity="center">

    <TextView
        android:id="@+id/tvTime"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Select Time"
        android:textSize="18sp"/>

    <Button
        android:id="@+id/btnPickTime"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Pick Time"
        android:layout_marginTop="20dp"/>

</LinearLayout>
