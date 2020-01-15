package com.example.bmclanternvan;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;
import java.util.Map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    Map<String, Map<Double, Double>> coordinates;
    Place dropoff;
    Place pickup;

    MapsActivity(String pickup, String dropoff) {
        this.dropoff = new Place(dropoff, coordinates.get(dropoff));
        this.pickup = new Place(pickup, coordinates.get(pickup));
    } // MapsActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        // initialize coordinates
        Map<Double, Double> admissions = new HashMap<>();
        admissions.put(40.024429, -75.313650);

        Map<Double, Double> bewttsycoed = new HashMap<>();
        bewttsycoed.put(40.027910, -75.314433);

        Map<Double, Double> brecon = new HashMap<>();
        brecon.put(40.030578, -75.317502);

        Map<Double, Double> cambrianrow = new HashMap<>();
        cambrianrow.put(40.029195, -75.317776);

        Map<Double, Double> campuscenter = new HashMap<>();
        campuscenter.put(40.028813, -75.313441);

        Map<Double, Double> canaday = new HashMap<>();
        canaday.put(40.027330, -75.314646);

        Map<Double, Double> carpenter = new HashMap<>();
        carpenter.put(40.026697, -75.314365);

        Map<Double, Double> cartref = new HashMap<>();
        cartref.put(40.026670, -75.311708);

        Map<Double, Double> dalton = new HashMap<>();
        dalton.put(40.027116, -75.311962);

        Map<Double, Double> denbigh = new HashMap<>();
        denbigh.put(40.02773, -75.312424);

        Map<Double, Double> erdman = new HashMap<>();
        erdman.put(40.025328, -75.311921);

        Map<Double, Double> goodhart = new HashMap<>();
        goodhart.put(40.026114, -75.315417);

        Map<Double, Double> gym = new HashMap<>();
        gym.put(40.030018, -75.316155);

        Map<Double, Double> healthcenter = new HashMap<>();
        healthcenter.put(40.026522, -75.311339);

        Map<Double, Double> merion = new HashMap<>();
        merion.put(40.028387, -75.313092);

        Map<Double, Double> newdorm = new HashMap<>();
        newdorm.put(40.025425, -75.314226);

        Map<Double, Double> park = new HashMap<>();
        park.put(40.029968, -75.314863);

        Map<Double, Double> pemarch = new HashMap<>();
        pemarch.put(40.026416, -75.312830);

        Map<Double, Double> radnor = new HashMap<>();
        radnor.put(40.029052, -75.313896);

        Map<Double, Double> rhoads = new HashMap<>();
        rhoads.put(40.027169, -75.315531);

        Map<Double, Double> rock = new HashMap<>();
        rock.put(40.025846, -75.314697);

        Map<Double, Double> starbucks = new HashMap<>();
        starbucks.put(40.021134, -75.316740);

        Map<Double, Double> taylor = new HashMap<>();
        taylor.put(40.027618, -75.313294);

        Map<Double, Double> wawa = new HashMap<>();
        wawa.put(40.018121, -75.322405);

        Map<Double, Double> wyndham = new HashMap<>();
        wyndham.put(40.025545, -75.313167);

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
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng pickup = new LatLng(-34, 151);
        LatLng dropoff = new LatLng(40.029968, -75.314863);
        mMap.addMarker(new MarkerOptions().position(dropoff).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dropoff));
    }
}
