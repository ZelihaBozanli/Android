package com.example.gyk301;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class WebActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView=(WebView)findViewById(R.id.web_view);
        openWebPage("https://gelecegiyazanlar.turkcell.com.tr");


    }

    public void openWebPage(String url){
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);

        final ProgressDialog progress=ProgressDialog.show(this,"geleceği yazanlar","Yükleniyor",true);
        progress.show();

        webView.setWebViewClient(new WebViewClient()
        {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Toast.makeText(getApplicationContext(),"sayfa yüklendi",Toast.LENGTH_LONG).show();
                progress.dismiss();

            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                Toast.makeText(getApplicationContext(),"Bir hata oluştu",Toast.LENGTH_LONG).show();
                progress.dismiss();

            }
        });

    }
}
