package com.youseokhwan.commitmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_o_auth.*

/**
 * OAuthActivity
 */
class OAuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_o_auth)

        // WebView 설정
        OAuthActivity_WebView.apply {
            settings.javaScriptEnabled = true
            webViewClient = WebViewClient()
        }
        OAuthActivity_WebView.loadUrl("http://google.com")
    }

    override fun onBackPressed() {
        if (OAuthActivity_WebView.canGoBack()) {
            OAuthActivity_WebView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
