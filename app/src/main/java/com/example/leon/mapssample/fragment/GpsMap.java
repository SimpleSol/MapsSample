package com.example.leon.mapssample.fragment;

import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

/**
 * Created by Leon on 10.12.2015.
 */
public class GpsMap extends MapFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getMap().setMyLocationEnabled(true);
        getMap().setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        getMap().addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.defaultMarker())
                .title("Ololo")
                .position(new LatLng(47, 39)));
        getMap().addPolyline(new PolylineOptions().add(
                new LatLng(47, 39),
                new LatLng(48, 39),
                new LatLng(49, 39),
                new LatLng(50, 39),
                new LatLng(51, 39)
        ));

    }

}








