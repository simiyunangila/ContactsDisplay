package com.example.contactsrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactsrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }

    fun displayContacts() {
        val contact1 = contacts("Grace ", "", "+254 7987643843")
        val contact2 = contacts("Warren ", "", "+254 7867648976")
        val contact3 = contacts("Joy ", "", "+254 7234543845")
        val contact4 = contacts("Lorraine ", "", "+254 1234643845")
        val contact5 = contacts("Jane ", "", "+254 7867643809")
        val contact6 = contacts("Christoper ", "", "+254 7567643845")
        val contact7 = contacts("Marry ", "", "+251 7456643845")
        val contact8 = contacts("Ephraim ", "", "+250 7867643845")
        val contact9 = contacts("Ishmail ", "", "+250 7867643840")
        val contact10 = contacts(" Wesley", "", "+254 7687643845")

        val contactlist = listOf(
            contact1,
            contact2,
            contact3,
            contact4,
            contact5,
            contact6,
            contact7,
            contact8,
            contact9,
            contact10
        )
        val contadapter = contactadapter(contactlist)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contadapter
    }
}


