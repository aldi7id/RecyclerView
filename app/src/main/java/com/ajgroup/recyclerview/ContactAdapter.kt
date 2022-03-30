package com.ajgroup.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ajgroup.recyclerview.databinding.ActivityMainBinding
import com.ajgroup.recyclerview.databinding.MyContactItemBinding

class ContactAdapter(val listContact: ArrayList<MyContact>) : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    class ViewHolder(val binding: MyContactItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = MyContactItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listContact.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvName.text = listContact[position].name
        holder.binding.tvNoHp.text = listContact[position].noHp
    }
}