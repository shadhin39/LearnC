package com.example.invisible.learnc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class codeactivity extends AppCompatActivity {

    private WebView codec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codeactivity);
        codec=findViewById(R.id.codec);
        codec.loadUrl("https://www.tutorialspoint.com/compile_c_online.php");
        WebSettings ws =codec.getSettings();
        codec.setWebViewClient(new WebViewClient());
        ws.setJavaScriptEnabled(true);
    }
}
