package com.example.contactsrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsrecyclerview.databinding.ContactlistBinding

class contactadapter(var contactsList: List<contacts>) : RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            ContactlistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact = contactsList.get(position)
        val binding = holder.binding
        binding.tvname.text = currentContact.name
        binding.tvnumber.text = currentContact.number
//        binding.ivperson.=currentContact.person
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}

class ContactViewHolder(var binding: ContactlistBinding) : RecyclerView.ViewHolder(binding.root)


