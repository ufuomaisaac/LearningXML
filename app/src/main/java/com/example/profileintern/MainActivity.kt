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
    lateinit var adapterHorizontal: ProfileAdapterHorizontal
    lateinit var adapterVertical: ProfileAdapterVertical

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

        var datasetVertical = listOf<ProfileItemVertical>(
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good"),
            ProfileItemVertical(imageId = R.drawable.image1, name = "ufuoma Isaac", message = "I ma good")

        )

        var datasetHorizontal = listOf<ProfileItemHorizontal>(
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro"),
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro"),
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro"),
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro"),
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro"),
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro"),
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro"),
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro"),
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro"),
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro"),
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro"),
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro"),
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro"),
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro"),
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro"),
            ProfileItemHorizontal(imageId = R.drawable.image1, firstName = "ufuoma isaac", lastName = "Ejemudaro")
        )

      /*  binding.horizontalRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        adapter = ProfileAdapter(dataSet = dataset)
        binding.horizontalRecyclerView.adapter = adapter


        binding.verticalRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL , false)
        binding.verticalRecyclerView.adapter = adapter*/



        binding.horizontalRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        adapterHorizontal = ProfileAdapterHorizontal(dataSet = datasetHorizontal)
        binding.horizontalRecyclerView.adapter = adapter


        binding.verticalRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL , false)
        adapterVertical = ProfileAdapterVertical(dataSet = datasetVertical)
        binding.verticalRecyclerView.adapter = adapter



    }
}