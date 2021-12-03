# Pinview
To get a Git project into your build:

# Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

```
  allprojects {
    repositories {
      ...
      maven { url 'https://jitpack.io' }
    }
  }
```

# Step 2. Add the dependency

```
  dependencies {
    implementation 'com.github.airmedsolutions:otpview:1.0.3'
  }
```

# How to use the library?
Once you completed with the above steps now its time to use the library. Well its very easy just add the following to your xml file to show the pinview:

```
...
<com.myairmed.pinview.OtpView
        android:id="@+id/otpView"
        style="@style/OtpWidget.OtpView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:cursorVisible="true"
        android:importantForAutofill="no"
        android:inputType="number"
        android:itemBackground="@color/white"
        android:textColor="@color/black"
        app:OtpCursorWidth="1dp"
        app:OtpItemCount="6"
        app:OtpLineColor="?attr/colorPrimary"
        app:OtpViewType="rectangle" />
...
```

Add otpview style in the AppTheme
```
<style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">
    <!-- Customize your theme here. -->
    <item name="otpViewStyle">@style/OtpWidget.OtpView</item>
</style>
```

To get a callback when the user enters the otp make use of OnOtpCompletionListener like wise
```
  private OtpView otpView;
  otpView = findViewById(R.id.otp_view);
  otpView.setListener(new OnOtpCompletionListener() {
      @Override public void onOtpCompleted(String otp) {
      // do other stuff
      Log.d("onOtpCompleted=>", otp);
      }
  });
```
