package com.example.bmclanternvan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.example.bmclanternvan.MapsActivity;
import com.example.bmclanternvan.R;

public class MainActivity extends AppCompatActivity {
    Button request;
    Spinner dropOffSpinner;
    Spinner pickUpSpinner;
    String [] locations = new String[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        request = (Button)findViewById(R.id.request);

        dropOffSpinner = (Spinner)findViewById(R.id.dropOffSpinner);
        pickUpSpinner = (Spinner)findViewById(R.id.pickUpSpinner);

        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                request(view);
            }
        });
    } // onCreate()

    public void request(View view) {
        String dropOff = dropOffSpinner.getSelectedItem().toString();
        String pickUp = pickUpSpinner.getSelectedItem().toString();

        locations[0] = pickUp;
        locations[1] = dropOff;
        Log.i("pickup", "the pickup location is: " + pickUp + ", and drop off is: " + dropOff);
        openActivity2();
    }

    public void openActivity2() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    } // openActivity2()
} // MainActivity