package com.example.contactsrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsrecyclerview.databinding.ContactlistBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

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
        binding.tvemail.text=currentContact.email
        Picasso
            .get()
            .load (currentContact.person)
            .placeholder(R.drawable.baseline_person_24)
//            .resize(80,80)
//            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.ivperson)

    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}

class ContactViewHolder(var binding: ContactlistBinding) : RecyclerView.ViewHolder(binding.root)


