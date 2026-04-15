#java :
package com.vaibhav.pracexams;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class SplashActivity extends AppCompatActivity {

    TextView tvDate;
    Button btnPickDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        tvDate = findViewById(R.id.tvDate);
        btnPickDate = findViewById(R.id.btnPickDate);

        btnPickDate.setOnClickListener(v -> {

            // Get current date
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            // Create DatePickerDialog
            DatePickerDialog datePickerDialog = new DatePickerDialog(
                    SplashActivity.this,
                    (view, selectedYear, selectedMonth, selectedDay) -> {

                        // Month starts from 0, so +1
                        selectedMonth = selectedMonth + 1;

                        String date = selectedDay + "/" + selectedMonth + "/" + selectedYear;
                        tvDate.setText(date);
                    },
                    year, month, day
            );

            datePickerDialog.show();
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
        android:id="@+id/tvDate"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Select Date"
        android:textSize="18sp"/>

    <Button
        android:id="@+id/btnPickDate"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Pick Date"
        android:layout_marginTop="20dp"/>

</LinearLayout>
