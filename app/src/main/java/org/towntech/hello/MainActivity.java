package org.towntech.hello;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Cliked(View v) {
        Toast.makeText(this, "확인1 버튼이 눌렸어요.", Toast.LENGTH_LONG).show();
    }
    public void onButton2Cliked(View v) {
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
            startActivity(myIntent);
    }

    public void onButton3Cliked(View v) {
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1000-1000"));
            startActivity(myIntent);
    }
}