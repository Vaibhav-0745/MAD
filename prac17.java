<FrameLayout xmlns:tools="http://schemas.android.com/tools"
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="250dp"
    android:layout_height="250dp"
    android:layout_gravity="center">

    <!-- Image (background) -->
    <ImageView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:src="@drawable/img"
        android:scaleType="centerCrop"/>

    <!-- Discount label (on top) -->
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="20% OFF"
        android:textColor="#FFFFFF"
        android:textSize="16sp"
        android:background="#FF0000"
        android:padding="6dp"
        android:layout_gravity="top|end"
        android:layout_margin="10dp"/>

</FrameLayout>
