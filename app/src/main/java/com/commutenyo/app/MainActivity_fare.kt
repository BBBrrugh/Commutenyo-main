package com.commutenyo.app

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Locale

class MainActivity_fare : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private var mList = ArrayList<LanguageData>()
    private lateinit var adapter: LanguageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fare)

        recyclerView = findViewById(R.id.recyclerView)
        searchView = findViewById(R.id.searchView)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        addDataToList()
        adapter = LanguageAdapter(mList)
        recyclerView.adapter = adapter

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })
    }

    private fun filterList(query: String?) {

        if (query != null) {
            val filteredList = ArrayList<LanguageData>()
            for (i in mList) {
                if (i.title.lowercase(Locale.ROOT).contains(query)) {
                    filteredList.add(i)
                }
            }

            if (filteredList.isEmpty()) {
                Toast.makeText(this, "No Data found", Toast.LENGTH_SHORT).show()
            } else {
                adapter.setFilteredList(filteredList)
            }
        }
    }

    private fun addDataToList() {



        mList.add(
            LanguageData(
                "Bustos - Cambaog",
                R.drawable.img_2,
                "Fare = 23₱ Discount = 20₱ Travel - @string/firebasedatastore_children_traveltime_cambaog mins"


            )
        )
        mList.add(
            LanguageData(
                "Bustos - Talampas",
                R.drawable.img_2,
                "Fare = 21₱ Discount = 19₱ Travel - @string/firebasedatastore_children_traveltime_talampas mins"
            )
        )
        mList.add(
            LanguageData(
                "Bustos - San Pedro",
                R.drawable.img_2,
                "Fare = 21₱ Discount = 19₱ Travel - @string/firebasedatastore_children_traveltime_sanpedro mins"
            )
        )
        mList.add(
            LanguageData(
                "Bustos - Bunga Menor",
                R.drawable.img_2,
                "Fare = 20₱ Discount = 17₱ Travel - @string/firebasedatastore_children_traveltime_bungame mins"
            )
        )
        mList.add(
            LanguageData(
                "Bustos - Bunga Mayor",
                R.drawable.img_2,
                "Fare = 20₱ Discount = 17₱ Travel - @string/firebasedatastore_children_traveltime_bungama mins"

            )
        )
        mList.add(
            LanguageData(
                "Bustos - Tibagan",
                R.drawable.img_2,
                "Fare = 25₱ Discount = 22₱ Travel - @string/firebasedatastore_children_traveltime_tibagan mins"
            )
        )
        mList.add(
            LanguageData(
                "Bustos - Malamig",
                R.drawable.img_2,
                "Fare = 20₱ Discount = 17₱ Travel - @string/firebasedatastore_children_traveltime_malamig mins"
            )
        )
        mList.add(
            LanguageData(
                "Bustos - Liciada",
                R.drawable.img_2,
                "Fare = 20₱ Discount = 17₱ Travel - @string/firebasedatastore_children_traveltime_malamig mins"
            )
        )
        mList.add(
            LanguageData(
                "Bustos - Catacte",
                R.drawable.img_2,
                "Fare = 25₱ Discount = 22₱ Travel - @string/firebasedatastore_children_traveltime_liciada mins"
            )
        )
        mList.add(
            LanguageData(
                "Bustos - Camachilehan",
                R.drawable.img_2,
                "Fare = 25₱ Discount = 22₱ Travel - @string/firebasedatastore_children_traveltime_camachi mins"
            )
        )
        mList.add(
            LanguageData(
                "Bustos - Tanawan",
                R.drawable.img_2,
                "Fare = 15₱ Discount = 13₱ Travel - @string/firebasedatastore_children_traveltime_tanawan mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag - Bustos",
                R.drawable.img_2,
                "Fare = 20₱ Discount = 13₱ Travel - mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag - Bunga Menor",
                R.drawable.img_2,
                "Fare = 30₱ Discount = 25₱ Travel - 25mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag - Bunga Mayor",
                R.drawable.img_2,
                "Fare = 35₱ Discount = 29₱ Travel - 32mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag - Tibagan",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 34₱ Travel - 32mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag - Tanawan",
                R.drawable.img_2,
                "Fare = 20₱ Discount = 19₱ Travel - 22mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag - San Pedro",
                R.drawable.img_2,
                "Fare = 21₱ Discount = 18₱ Travel - 19mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag - Talampas ",
                R.drawable.img_2,
                "Fare = 23₱ Discount = 21₱ Travel - 24mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag - Cambaog ",
                R.drawable.img_2,
                "Fare = 23₱ Discount = 21₱ Travel - 24mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag - Malamig ",
                R.drawable.img_1,
                "Fare = 30₱ Discount = 26₱ Travel - 28mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag - Liciada ",
                R.drawable.img_2,
                "Fare =30₱ Discount = 26₱ Travel - 32mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag - Catacte",
                R.drawable.img_2,
                "Fare = 32₱ Discount = 28₱ Travel - 37mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag - Poblacion ",
                R.drawable.img_2,
                "Fare = 15₱ Discount = 13₱ Travel - 18mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag - Malawak ",
                R.drawable.img_2,
                "Fare = 45₱ Discount = 38₱ Travel - 42mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag - Buisan ",
                R.drawable.img_2,
                "Fare = 38₱ Discount = 34₱ Travel - 36mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag - Camachilihan ",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )
        mList.add(
            LanguageData(
                "Plaridel - Cambaog ",
                R.drawable.img_2,
                "Fare = 30₱ Discount = 26₱ Travel - 20mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag - SM Baliwag ",
                R.drawable.img_1,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag - Bagong Nayon ",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )
        mList.add(
            LanguageData(
                "Baliwag -  Barangka",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag - Paitan",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag -  Calantipay",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag - Catulinan",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag - Pinagbarilan ",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag - Concepcion Bungad ",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag - Concepcion Dulo ",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag - Hinukay ",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag - Matang Tubig  ",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag - Pagala ",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag - Poblacion ",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )


        mList.add(
            LanguageData(
                "Baliwag - Sabang ",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag - Sabang Dulo ",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag - San Roque ",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag - Santa Barbara ",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )

        mList.add(
            LanguageData(
                "Baliwag - Sanjose ",
                R.drawable.img_2,
                "Fare = 40₱ Discount = 35₱ Travel - 34mins"
            )
        )



    }
}