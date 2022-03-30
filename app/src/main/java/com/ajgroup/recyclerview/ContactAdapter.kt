package com.ajgroup.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ajgroup.recyclerview.databinding.ActivityMainBinding
import com.ajgroup.recyclerview.databinding.MyContactItemBinding

class ContactAdapter(val listContact: ArrayList<MyContact>) : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    lateinit var binding: MyContactItemBinding
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = MyContactItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return listContact.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        binding.tvName.text = listContact[position].name
        binding.tvNoHp.text = listContact[position].noHp
    }
}