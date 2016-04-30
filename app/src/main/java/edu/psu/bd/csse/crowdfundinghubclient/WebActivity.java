package edu.psu.bd.csse.crowdfundinghubclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // display progress in title bar
        //getWindow().requestFeature(Window.FEATURE_PROGRESS);

        //setContentView(R.layout.activity_web);

        String intentUrl = getIntent().getExtras().getString("url");

        //WebView webView = (WebView)findViewById(R.id.webView);
        WebView webView = new WebView(this);
        // enable JavaScript **Important, we need browser-like behavior
        webView.getSettings().setJavaScriptEnabled(true);

        /*final Activity activity = this;
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                activity.setProgress(progress * 1000);
            }
        });*/

        // have all links clicked by user be loaded in the webview
        webView.setWebViewClient(new WebViewClient());

        setContentView(webView);

        webView.loadUrl(intentUrl);
    }
}
