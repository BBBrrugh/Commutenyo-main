package com.commutenyo.app

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.commutenyo.app.Bottom_Navigation.fragment_fare.fare
import com.commutenyo.app.Bottom_Navigation.fragment_history.history
import com.commutenyo.app.Bottom_Navigation.fragment_home.home
import com.commutenyo.app.databinding.ActivityMainBinding
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.material.navigation.NavigationView



/*

import com.codingwithmitch.googlemaps2018.R;
import com.codingwithmitch.googlemaps2018.UserClient;
import com.codingwithmitch.googlemaps2018.models.User;
import com.codingwithmitch.googlemaps2018.models.UserLocation;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.GeoPoint;


import android.Manifest
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.location.LocationListener
import android.os.Build
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import java.io.IOException */


class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener,OnMapReadyCallback {

    private lateinit var mMap: OnMapReadyCallback
    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        replacefragment(home())

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)


      /*  val button = findViewById<Button>(R.id.fab) as Button

        //view maps fragment using floating action button

        button.setOnClickListener{

            val mapsfragment = MapsActivity()
            val fragment : Fragment? = supportFragmentManager.findFragmentByTag(MapsActivity::class.java.simpleName)
            if(fragment !is Fragment){
                supportFragmentManager.beginTransaction()
                    .add(R.id.map_fragment, mapsfragment, MapsActivity::class.java.simpleName)
                    .commit()
            }
        } */

//Toggles sidebar
        val toggle = ActionBarDrawerToggle(
            this,
            binding.drawerlayout,
            binding.toolbar,
            R.string.open_nav,
            R.string.close_nav
        )
        binding.drawerlayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navigationDrawer.setNavigationItemSelectedListener{

            when (it.itemId) {
                R.id.nav_about_us -> replacefragment(aboutus())



                else -> {

                }

            }
            true
        }



        //toggles side bar





        binding.bottomNavigation.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.bott_fareguide -> replacefragment(fare())
                R.id.bott_history -> replacefragment(history())
                R.id.bott_home -> replacefragment(home())


                else -> {

                }

            }
            true
        }


    }

    //ignores super class error
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        TODO("Not yet implemented")
        //ignores super class error
    }

    private fun replacefragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_layout, fragment)
        fragmentTransaction.commit()


    }

    override fun onMapReady(p0: GoogleMap) {
        TODO("Not yet implemented")
    }


}





