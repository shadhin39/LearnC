package com.example.invisible.learnc;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class youtubeviewholder extends RecyclerView.ViewHolder {
    WebView webView;
    Button button;
    public youtubeviewholder(@NonNull View itemView) {
        super(itemView);
        webView=itemView.findViewById(R.id.videowiew);
        button=itemView.findViewById(R.id.fullscreen);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);


    }
}
