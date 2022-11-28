package com.leral3.containerspinnerwithhoroscpoes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        var myWebView:WebView = findViewById(R.id.webview)
        myWebView.webViewClient = WebViewClient()

        if(intent.hasExtra("stars")){
            val starName = intent.getStringExtra("stars")
            val url = "https://search.naver.com/search.naver?where=nexearch&sm=tab_etc&qvt=0&query=$starName%20운세"

            myWebView.loadUrl(url)
        }

    }
}