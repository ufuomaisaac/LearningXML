package com.example.profileintern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.HorizontalScrollView
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.profileintern.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var dataset = listOf<ProfileData>(
            ProfileData( firstName = "Ufuoma Isaac", lastMessage = "I am doing good"),
            ProfileData(firstName = "isaac isaac", lastMessage = "I am doing fine ee"),
            ProfileData( firstName = "Ufuoma Isaac", lastMessage = "I am doing good"),
            ProfileData(firstName = "isaac isaac", lastMessage = "I am doing fine ee"),
            ProfileData( firstName = "Ufuoma Isaac", lastMessage = "I am doing good"),
            ProfileData(firstName = "isaac isaac", lastMessage = "I am doing fine ee"),
            ProfileData( firstName = "Ufuoma Isaac", lastMessage = "I am doing good"),
            ProfileData(firstName = "isaac isaac", lastMessage = "I am doing fine ee"),
            ProfileData( firstName = "Ufuoma Isaac", lastMessage = "I am doing good"),
            ProfileData(firstName = "isaac isaac", lastMessage = "I am doing fine ee"),
            ProfileData( firstName = "Ufuoma Isaac", lastMessage = "I am doing good"),
            ProfileData(firstName = "isaac isaac", lastMessage = "I am doing fine ee"),
            ProfileData( firstName = "Ufuoma Isaac", lastMessage = "I am doing good"),
            ProfileData(firstName = "isaac isaac", lastMessage = "I am doing fine ee"),
            ProfileData( firstName = "Ufuoma Isaac", lastMessage = "I am doing good"),
            ProfileData(firstName = "isaac isaac", lastMessage = "I am doing fine ee"),
            ProfileData( firstName = "Ufuoma Isaac", lastMessage = "I am doing good"),
            ProfileData(firstName = "isaac isaac", lastMessage = "I am doing fine ee"),
            ProfileData( firstName = "Ufuoma Isaac", lastMessage = "I am doing good"),
            ProfileData(firstName = "isaac isaac", lastMessage = "I am doing fine ee"),
        )

        binding.horizontalRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        adapter = ProfileAdapter(dataSet = dataset)
        binding.horizontalRecyclerView.adapter = adapter


        binding.verticalRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL , false)
        //adapter = ProfileAdapter(dataSet = dataset)
        binding.verticalRecyclerView.adapter = adapter

        //adapter.updateList(dataset)
    }
}