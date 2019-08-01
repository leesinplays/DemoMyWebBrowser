package sg.edu.rp.c346.demomywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;
    EditText etInputURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);
        etInputURL = findViewById(R.id.editTextInputURL);

        wvMyPage.setWebViewClient(new WebViewClient());

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = etInputURL.getText().toString();
                wvMyPage.loadUrl(url);
                wvMyPage.getSettings().getJavaScriptEnabled();
                wvMyPage.getSettings().setAllowFileAccess(false);
                wvMyPage.getSettings().getDisplayZoomControls();
                etInputURL.setVisibility(View.GONE);
            }
        });
    }
}
