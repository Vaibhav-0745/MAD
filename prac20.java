#Java : 
package com.vaibhav.pracexams;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      listView = findViewById(R.id.listView);

      String[] data = {
      "Vaibhav - 11/05/2007",
              "Aditi - 07/04/2009"
      };

      ArrayAdapter<String> adapter = new ArrayAdapter<>(
              this, android.R.layout.simple_list_item_1,data
      );
      listView.setAdapter(adapter);

    }
}

#XML:
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <ListView
        android:id="@+id/listView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

</LinearLayout>
