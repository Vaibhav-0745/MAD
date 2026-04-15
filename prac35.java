📱 1. XML Layout (activity_main.xml)
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical"
    android:padding="20dp">

    <TextView
        android:id="@+id/tvLocation"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Location will appear here"
        android:textSize="18sp"/>

    <Button
        android:id="@+id/btnGetLocation"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Get Location"
        android:layout_marginTop="20dp"/>

</LinearLayout>
☕ 2. Java Code (MainActivity.java)
package com.vaibhav.pracexams;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvLocation;
    Button btnGetLocation;
    LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLocation = findViewById(R.id.tvLocation);
        btnGetLocation = findViewById(R.id.btnGetLocation);

        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        btnGetLocation.setOnClickListener(v -> {

            // Permission check
            if (ActivityCompat.checkSelfPermission(this,
                    Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
                return;
            }

            locationManager.requestLocationUpdates(
                    LocationManager.GPS_PROVIDER,
                    1000,
                    1,
                    new LocationListener() {
                        @Override
                        public void onLocationChanged(@NonNull Location location) {

                            double lat = location.getLatitude();
                            double lon = location.getLongitude();

                            tvLocation.setText("Lat: " + lat + "\nLon: " + lon);
                        }
                    }
            );
        });
    }

    // Permission result
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == 1 && grantResults.length > 0
                && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
        }
    }
}
📄 3. AndroidManifest.xml (IMPORTANT)
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
