package com.example.bmclanternvan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap map;
    Map<String, double[]> coordinates = new HashMap<>();
    Queue<Ride> rides = new PriorityQueue<>();
    Ride ride;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        // initialize coordinates
        double[] admissions = {40.024429, -75.313650};
        double[] bewttsycoed = {40.027910, -75.314433};
        double[] brecon = {40.030578, -75.317502};
        double[] cambrianrow = {40.029195, -75.317776};
        double[] campuscenter = {40.028813, -75.313441};
        double[] canaday = {40.027330, -75.314646};
        double[] carpenter = {40.026697, -75.314365};
        double[] cartref = {40.026670, -75.311708};
        double[] dalton = {40.027116, -75.311962};
        double[] denbigh = {40.02773, -75.312424};
        double[] erdman = {40.025328, -75.311921};
        double[] goodhart = {40.026114, -75.315417};
        double[] gym = {40.030018, -75.316155};
        double[] healthcenter = {40.026522, -75.311339};
        double[] merion = {40.028387, -75.313092};
        double[] newdorm = {40.025425, -75.314226};
        double[] park = {40.029968, -75.314863};
        double[] pemarch = {40.026416, -75.312830};
        double[] radnor = {40.029052, -75.313896};
        double[] rhoads = {40.027169, -75.315531};
        double[] rock = {40.025846, -75.314697};
        double[] starbucks = {40.021134, -75.316740};
        double[] taylor = {40.027618, -75.313294};
        double[] wawa = {40.018121, -75.322405};
        double[] wyndham = {40.025545, -75.313167};

        coordinates.put("Office of Undergraduate Admissions", admissions);
        coordinates.put("Bewtts-y-Coed", bewttsycoed);
        coordinates.put("Brecon Hall", brecon);
        coordinates.put("Cambrian Row", cambrianrow);
        coordinates.put("Campus Center", campuscenter);
        coordinates.put("Canaday Library", canaday);
        coordinates.put("Carpenter", carpenter);
        coordinates.put("Cartref", cartref);
        coordinates.put("Dalton Hall", dalton);
        coordinates.put("Denbigh", denbigh);
        coordinates.put("Erdman", erdman);
        coordinates.put("Goodhart Theater", goodhart);
        coordinates.put("Gym", gym);
        coordinates.put("Health Center", healthcenter);
        coordinates.put("Merion Hall", merion);
        coordinates.put("New Dorm", newdorm);
        coordinates.put("Park Science Building", park);
        coordinates.put("Pem Arch", pemarch);
        coordinates.put("Radnor", radnor);
        coordinates.put("Rhoads", rhoads);
        coordinates.put("Rockefeller Hall", rock);
        coordinates.put("Starbucks", starbucks);
        coordinates.put("Taylor Hall", taylor);
        coordinates.put("Wawa", wawa);
        coordinates.put("Wyndham", wyndham);

        Intent intent = getIntent();

        // set pickup and dropoff locations
        Place pickup = new Place(intent.getStringExtra("pickup"), coordinates.get(intent.getStringExtra("pickup")));
        Place dropoff = new Place(intent.getStringExtra("dropoff"), coordinates.get(intent.getStringExtra("dropoff")));



        // add the ride info
        ride = new Ride(1, pickup, dropoff);
        rides.add(ride);
    } // onCreate()


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        // set the pickup and dropoff locations
        LatLng pickup = new LatLng(ride.getPickup().getLatitude(), ride.getPickup().getLongitude());
        LatLng dropoff = new LatLng(ride.getDropoff().getLatitude(), ride.getDropoff().getLongitude());

        // add markers to the map and focus the camera on where the markers are
        map.addMarker(new MarkerOptions().position(pickup).title(ride.getPickup().getName()));
        map.addMarker(new MarkerOptions().position(dropoff).title(ride.getDropoff().getName()));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(dropoff, 15));
    } // onMapReady()
} // MapsActivity