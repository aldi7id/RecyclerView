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
            MyContact("Sabrina","083875882441"),
            MyContact("Aldi","083875323424"),
            MyContact("Sayang","0843432441"),
            MyContact("Kamu","08382342423"),
            MyContact("Tapi","0821241221"),
            MyContact("Malah","084215122341"),
            MyContact("Mantanku","083875882441"),
            MyContact("Yang","0838754242"),
            MyContact("Suka","086123422441"),
            MyContact("Aku","083521322441")
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