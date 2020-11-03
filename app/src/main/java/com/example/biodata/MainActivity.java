package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMap(View view) {
        Uri uri = Uri.parse("geo:-8.829519012618114, 115.15814158592981q=");
        Intent it = new Intent (Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void cellPhone(View view) {
        Uri uri = Uri.parse("tel:081529346820");
        Intent it = new Intent (Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"hashiradito@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi Android");
        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email?"));
        } catch (android.content.ActivityNotFoundException ex){

        }
    }
}