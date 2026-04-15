<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:padding="20dp"
    android:stretchColumns="1">

    <!-- Item Price -->
    <TableRow>
        <TextView
            android:text="Item Price"
            android:textStyle="bold"
            android:padding="10dp"/>

        <TextView
            android:id="@+id/tvItemPrice"
            android:text="₹1000"
            android:padding="10dp"/>
    </TableRow>

    <!-- Tax -->
    <TableRow>
        <TextView
            android:text="Tax (10%)"
            android:textStyle="bold"
            android:padding="10dp"/>

        <TextView
            android:id="@+id/tvTax"
            android:text="₹100"
            android:padding="10dp"/>
    </TableRow>

    <!-- Shipping -->
    <TableRow>
        <TextView
            android:text="Shipping"
            android:textStyle="bold"
            android:padding="10dp"/>

        <TextView
            android:id="@+id/tvShipping"
            android:text="₹50"
            android:padding="10dp"/>
    </TableRow>

    <!-- Total -->
    <TableRow>
        <TextView
            android:text="Total"
            android:textStyle="bold"
            android:textSize="18sp"
            android:padding="10dp"/>

        <TextView
            android:id="@+id/tvTotal"
            android:text="₹1150"
            android:textStyle="bold"
            android:textSize="18sp"
            android:padding="10dp"/>
    </TableRow>

</TableLayout>
