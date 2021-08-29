package com.example.scrollsandcardviewlayou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

public class MainActivity2 extends AppCompatActivity {
    private WebView wv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        wv= findViewById(R.id.webview);
        wv.setWebViewClient(new WebViewClient());

        wv.loadUrl("https://www.google.com");



    }
}