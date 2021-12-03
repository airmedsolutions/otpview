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

# PinView Attributes

<table>
  <thead>
    <tr>
      <th>Attribute</th>
      <th>Use</th>
    </tr>
  </thead>
  <tr>
    <td>app:OtpItemCount</td>
    <td>sets the length of the otp view</td>
  </tr>
  <tr>
    <td>app:OtpItemWidth</td>
    <td>sets the width of each item inside the otp view</td>
  </tr>
  <tr>
    <td>app:OtpItemHeight</td>
    <td>sets the height of each item inside the otp view</td>
  </tr>
	<tr>
    <td>app:OtpItemSpacing</td>
    <td>sets the space between each item in otp view</td>
  </tr>
	<tr>
    <td>app:OtpLineWidth</td>
    <td>sets the line border width</td>
  </tr>
  <tr>
    <td>app:OtpLineColor</td>
    <td>sets the color to the line border</td>
  </tr>
  <tr>
    <td>app:OtpViewType</td>
    <td>sets the view type of the otp view it can be either ```rectangle```, ```line``` or ```none```</td>
  </tr>
  <tr>
    <td>app:OtpCursorVisible</td>
    <td>sets the visibility of the cursor</td>
  </tr>
	<tr>
    <td>app:OtpCursorColor</td>
    <td>sets the color of the cursor</td>
  </tr>
	<tr>
    <td>app:OtpCursorWidth</td>
    <td>sets width of the cursor</td>
  </tr>
	<tr>
    <td>app:OtpItemBackground</td>
    <td>sets the background color of each item in the otp view</td>
  </tr>
	<tr>
    <td>app:OtpHideLineWhenFilled</td>
    <td>toggles the line border</td>
  </tr>
	<tr>
    <td>app:OtpRtlTextDirection</td>
    <td>toggles RTL text direction</td>
  </tr>
	<tr>
    <td>app:OtpState_filled</td>
    <td>toggles the option fill the field after data has been entered (Style of file can we set with a drawable assigned using itemBackground)</td>
  </tr>	
</table>
