package com.rahmatullahrizki.tugas_sensor_2022_akb_if7_10119283;
//         NIM: 10119183
//         Nama: Rahmatullah Rizki
//         Kelas: IF-7
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class FragmentFood extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        @Override
        public void onMapReady(GoogleMap googleMap) {
            googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

            LatLng location_1 = new LatLng(-6.8874580097794835, 107.61541179729612);
            googleMap.addMarker(new MarkerOptions().position(location_1).title("warkop sukarasa"));
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location_1,16));

            LatLng location_2 = new LatLng(-6.884690211165664, 107.61533828380529);
            googleMap.addMarker(new MarkerOptions().position(location_2).title("warkop 99"));

            LatLng location_3 = new LatLng(-6.878644056445201, 107.61261059729601);
            googleMap.addMarker(new MarkerOptions().position(location_3).title("krisbar"));

            LatLng location_4 = new LatLng(-7.007375470802738, 107.61285666174047);
            googleMap.addMarker(new MarkerOptions().position(location_4).title("RM Padang"));

            LatLng location_5 = new LatLng(-7.0080044582924135, 107.61228171692888);
            googleMap.addMarker(new MarkerOptions().position(location_5).title("Mimut Donat"));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_food, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}