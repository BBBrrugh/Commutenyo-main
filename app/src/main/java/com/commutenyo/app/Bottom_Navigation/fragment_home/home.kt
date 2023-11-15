package com.commutenyo.app.Bottom_Navigation.fragment_home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.commutenyo.app.LocationTrackingActivity
import com.commutenyo.app.R
import com.google.android.gms.maps.MapView


class home : Fragment() {

    private lateinit var mapView: MapView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Get a reference to the button using its ID
        val button: Button = view.findViewById(R.id.buttoninitialize_home)

        // Set a click listener on the button
        button.setOnClickListener {
            // Your code to handle the button click event goes here
            val intent = Intent(this@home.context, LocationTrackingActivity::class.java)
            startActivity(intent)
        }
    }
}







