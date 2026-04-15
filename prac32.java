📱 1. XML Layout (activity_main.xml)
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical">

    <TextView
        android:id="@+id/tvStatus"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Airplane Mode Status"
        android:textSize="18sp"/>

</LinearLayout>
📡 2. BroadcastReceiver Class (AirplaneReceiver.java)
package com.vaibhav.pracexams;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        boolean isOn = intent.getBooleanExtra("state", false);

        if (isOn) {
            Toast.makeText(context, "Airplane Mode ON", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Airplane Mode OFF", Toast.LENGTH_SHORT).show();
        }
    }
}
☕ 3. Register Receiver in MainActivity.java
package com.vaibhav.pracexams;

import android.content.IntentFilter;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    AirplaneReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        receiver = new AirplaneReceiver();

        // Register receiver
        IntentFilter filter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(receiver, filter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }
}
📄 4. AndroidManifest.xml (optional)

👉 No permission needed, but you can also register statically:

<receiver android:name=".AirplaneReceiver">
    <intent-filter>
        <action android:name="android.intent.action.AIRPLANE_MODE"/>
    </intent-filter>
</receiver>
