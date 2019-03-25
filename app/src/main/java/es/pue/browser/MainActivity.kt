package es.pue.browser

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var urlString:String?=null
        if(intent.dataString!=null) {
            urlString= intent.dataString
        }
        // Es necesario webViewClient para que coja bien la redirección.
        // Sino cando tenga que hacer una redirección hará un new Intent y saltará a Chrome
        main_webView.webViewClient = WebViewClient()
        main_webView.loadUrl(urlString);
    }
}
