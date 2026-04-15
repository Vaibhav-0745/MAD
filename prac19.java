<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:padding="20dp">

    <!-- Add to Cart Button (Left Side) -->
    <Button
        android:id="@+id/btnCart"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Add to Cart"
        android:layout_alignParentStart="true"/>

    <!-- Buy Now Button (Right Side) -->
    <Button
        android:id="@+id/btnBuy"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Buy Now"
        android:layout_alignParentEnd="true"/>

</RelativeLayout>
