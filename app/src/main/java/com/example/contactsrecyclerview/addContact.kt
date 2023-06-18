package com.example.contactsrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.contactsrecyclerview.databinding.ActivityAddContactBinding

class addContact : AppCompatActivity() {
    lateinit var binding: ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_add_contact)
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnSave.setOnClickListener {

            validateAddContact()
            clearErrors()
        }

    }

    fun validateAddContact(){
        val name1 = binding.etfirname.text.toString()
        val name2 = binding.etemail.text.toString()
        val phone = binding.etnumber.text.toString()


        var error =false

        if (name1.isEmpty()) {
            binding.tilfirname.error = " Name required"
            Toast.makeText(this, "Please enter name", Toast.LENGTH_SHORT).show();
            error = true
        }


        if (name2.isEmpty()){
            binding.tilemail.error= "Email Address required"
            Toast.makeText(this, "Enter Email address", Toast.LENGTH_SHORT).show()
            error = true
        }

        if (phone.isEmpty()) {
            binding.tilnumber.error = "Phone number required"
            Toast.makeText(this, "Please enter phone number", Toast.LENGTH_SHORT).show();
            error = true
        }
        if (!error){
//            val y = Intent(this,addContact::class.java)
//            startActivity(y)
            Toast.makeText(this,"Contact has been added", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
    fun clearErrors(){
        binding.tilfirname.error=null
        binding.etemail.error = null
        binding.tilnumber.error = null
    }
}