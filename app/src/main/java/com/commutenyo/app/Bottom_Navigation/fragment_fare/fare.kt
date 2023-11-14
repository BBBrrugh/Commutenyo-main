package com.commutenyo.app.Bottom_Navigation.fragment_fare

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.commutenyo.app.LanguageAdapter
import com.commutenyo.app.LanguageData
import com.commutenyo.app.MainActivity_fare
import com.commutenyo.app.R

class fare : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private var mList = ArrayList<LanguageData>()
    private lateinit var adapter: LanguageAdapter


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
        val button: Button = view.findViewById(R.id.buttoninitialize)

        // Set a click listener on the button
        button.setOnClickListener {
            // Your code to handle the button click event goes here
            val intent = Intent(this@fare.context, MainActivity_fare::class.java)
            startActivity(intent)
        }
    }
}




