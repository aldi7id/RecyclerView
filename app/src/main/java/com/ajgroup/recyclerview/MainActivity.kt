package com.ajgroup.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ajgroup.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listContact = arrayListOf(
            MyContact(1,"Sabrina","083875882441"),
            MyContact(2,"Aldi","083875323424"),
            MyContact(3,"Sayang","0843432441"),
            MyContact(4,"Kamu","08382342423"),
            MyContact(5,"Tapi","0821241221"),
            MyContact(6,"Malah","084215122341"),
            MyContact(7,"Mantanku","083875882441"),
            MyContact(8,"Yang","0838754242"),
            MyContact(9,"Suka","086123422441"),
            MyContact(10,"Aku","083521322441")
        )

        //Membuat Adapter
        val adapter = ContactAdapter(listContact)

        //LayoutManager
        //val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        //Set Layout manager pada RecycleView
        //binding.recycleView.layoutManager = layoutManager

        //set adapter pada recycleview
        binding.recycleView.adapter = adapter

    }
}