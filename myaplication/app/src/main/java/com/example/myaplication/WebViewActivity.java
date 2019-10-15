package com.example.myaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView nWebView=(WebView) findViewById(R.id.wv_news);
        nWebView.getSettings().setJavaScriptEnabled(true);
        nWebView.loadUrl("https://gelecegiyazanlar.turkcell.com.tr");

        WebView haber=(WebView)findViewById(R.id.wv_haber);
        nWebView.getSettings().setJavaScriptEnabled(true);
        nWebView.loadUrl("https://gelecegiyazanlar.turkcell.com.tr");
    }
}
