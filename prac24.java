#java :
package com.vaibhav.pracexams;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etFahrenheit;
    Button btnConvert;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFahrenheit = findViewById(R.id.etFahrenheit);
        btnConvert = findViewById(R.id.btnConvert);
        tvResult = findViewById(R.id.tvResult);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = etFahrenheit.getText().toString();

                if (!input.isEmpty()) {
                    double f = Double.parseDouble(input);

                    double c = (f - 32) * 5 / 9;

                    tvResult.setText("Celsius: " + c);
                } else {
                    tvResult.setText("Please enter value");
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
    android:padding="20dp"
    android:gravity="center">

    <EditText
        android:id="@+id/etFahrenheit"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Fahrenheit"
        android:inputType="numberDecimal"/>

    <Button
        android:id="@+id/btnConvert"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Convert"
        android:layout_marginTop="15dp"/>

    <TextView
        android:id="@+id/tvResult"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Celsius: "
        android:textSize="18sp"
        android:layout_marginTop="20dp"/>

</LinearLayout>
