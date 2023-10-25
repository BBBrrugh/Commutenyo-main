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
import com.commutenyo.app.Bottom_Navigation.fragment_location.location
import com.commutenyo.app.Bottom_Navigation.fragment_schedule.schedule
import com.commutenyo.app.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

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
        binding.navigationDrawer.setNavigationItemSelectedListener(this)//toggles side bar





        binding.bottomNavigation.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.bott_fareguide -> replacefragment(fare())
                R.id.bott_location -> replacefragment(location())
                R.id.bott_schedule -> replacefragment(schedule())
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

}




