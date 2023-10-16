package com.commutenyo.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


internal class MapsActivity : AppCompatActivity(), OnMapReadyCallback {


    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

    }


    override fun onMapReady(googleMap: GoogleMap) {
        // Set the map coordinates to Kyoto Japan.
        // Set the map coordinates to Kyoto Japan.
        val kyoto = LatLng(14.928972, 120.893889)
        // Set the map type to Hybrid.
        // Set the map type to Hybrid.
        googleMap.mapType = GoogleMap.MAP_TYPE_HYBRID
        // Add a marker on the map coordinates.
        // Add a marker on the map coordinates.
        googleMap.addMarker(
            MarkerOptions()
                .position(kyoto)
                .title("My Location")
        )
        // Move the camera to the map coordinates and zoom in closer.
        // Move the camera to the map coordinates and zoom in closer.
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(kyoto))
        googleMap.moveCamera(CameraUpdateFactory.zoomTo(15f))
        // Display traffic.
        // Display traffic.
        googleMap.isTrafficEnabled = true
    }
}
