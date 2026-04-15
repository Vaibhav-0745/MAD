📱 1. XML Layout (activity_main.xml)
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical">

    <Button
        android:id="@+id/btnOn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Turn Bluetooth ON"/>

</LinearLayout>
☕ 2. Java Code (MainActivity.java)
package com.vaibhav.pracexams;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnOn;
    BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOn = findViewById(R.id.btnOn);

        // Get Bluetooth Adapter
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        btnOn.setOnClickListener(v -> {

            if (bluetoothAdapter == null) {
                Toast.makeText(this, "Bluetooth not supported", Toast.LENGTH_SHORT).show();
            } 
            else if (!bluetoothAdapter.isEnabled()) {

                // Request to turn ON Bluetooth
                Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivity(intent);

            } 
            else {
                Toast.makeText(this, "Bluetooth already ON", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
📄 3. Permission (AndroidManifest.xml)
<uses-permission android:name="android.permission.BLUETOOTH"/>
<uses-permission android:name="android.permission.BLUETOOTH_ADMIN"/>
