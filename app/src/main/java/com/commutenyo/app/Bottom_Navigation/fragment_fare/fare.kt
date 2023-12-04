package com.commutenyo.app.Bottom_Navigation.fragment_fare

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.commutenyo.app.R
import com.commutenyo.app.fare_view.UserlistActivity

class fare : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fare, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Get a reference to the button using its ID
        val button: Button = view.findViewById(R.id.button_fare)

        // Set a click listener on the button
        button.setOnClickListener {
            // Your code to handle the button click event goes here
            val intent = Intent(this@fare.context, UserlistActivity::class.java)
            startActivity(intent)
        }
    }


}




