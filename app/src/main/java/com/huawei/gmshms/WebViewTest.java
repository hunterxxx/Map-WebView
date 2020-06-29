package com.huawei.gmshms;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class WebViewTest extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        WebView webView = findViewById(R.id.webview);

        webView.loadUrl("https://hunterxxx.github.io");
    }

}
