package com.ratanbd.allbanglanewspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ratanbd.allbanglanewspaper.databinding.ActivityWebViewBinding;

public class WebViewActivity extends AppCompatActivity {
    private ActivityWebViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWebViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        WebView webView = binding.webView;

        // Retrieve the website URL from the Intent extras
        String websiteUrl = getIntent().getStringExtra("websiteUrl");

        if (websiteUrl != null && !websiteUrl.isEmpty()) {
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true); // Enable JavaScript if needed
            webView.loadUrl(websiteUrl);
        }
    }
}
