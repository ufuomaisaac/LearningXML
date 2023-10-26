package com.example.profileintern

import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapter(var dataSet : List<ProfileData> = emptyList()) : RecyclerView.Adapter<ProfileAdapter.viewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapter.viewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.profile_message, parent, false)
        return viewHolder(view)
    }

    inner class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

       // var profilePicture = itemView.findViewById<ImageView>(R.id.profile_picture)
        var name  = itemView.findViewById<TextView>(R.id.name)
        var lastMessage = itemView.findViewById<TextView>(R.id.message)
    }

    override fun onBindViewHolder(holder: ProfileAdapter.viewHolder, position: Int) {
        var item = dataSet[position]
        holder.name.text = item.firstName
       // holder.profilePicture.setImageResource(item.imageId)
        holder.lastMessage.text = item.lastMessage
    }

    fun updateList(list: List<ProfileData>) {
        this.dataSet = list
        notifyDataSetChanged()
        notifyItemInserted(dataSet.size - 1)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}