package com.example.bmclanternvan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bmclanternvan.MapsActivity;
import com.example.bmclanternvan.R;

public class MainActivity extends AppCompatActivity {
    Button request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        request = (Button)findViewById(R.id.request);
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    } // onCreate()

    public void openActivity2() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    } // openActivity2()
} // MainActivity