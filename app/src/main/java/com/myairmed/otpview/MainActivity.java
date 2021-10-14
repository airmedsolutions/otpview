package com.myairmed.otpview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;

import com.myairmed.pinview.OnOtpCompletionListener;
import com.myairmed.pinview.OtpView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OtpView otpView = findViewById(R.id.otpView);
        otpView.setOtpCompletionListener(otp -> {
            hideSoftKeyBoard();
        });
    }

    private void hideSoftKeyBoard() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
    }
}