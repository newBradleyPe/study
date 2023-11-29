package com.bignerdranch.android.study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val url = "file:///android_asset/NewDemo/index.html"
        val webView : WebView = findViewById(R.id.web_view)
        webView.loadUrl(url)
        webView.settings.javaScriptEnabled = true
    }
}