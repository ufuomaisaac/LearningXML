package com.example.profileintern

import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapterVertical(var dataSet : List<ProfileItemVertical> = emptyList()) : RecyclerView.Adapter<ProfileAdapterVertical.viewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapterVertical.viewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.profile_vertical_layout, parent, false)
        return viewHolder(view)
    }

    inner class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

       var profilePicture = itemView.findViewById<ImageView>(R.id.profile_picture)
        var name  = itemView.findViewById<TextView>(R.id.name)
        var message = itemView.findViewById<TextView>(R.id.message)
    }

    override fun onBindViewHolder(holder: ProfileAdapterVertical.viewHolder, position: Int) {
        var item = dataSet[position]
        holder.name.text = item.name
        holder.profilePicture.setImageResource(item.imageId)
        holder.message.text = item.message
    }

    fun updateList(list: List<ProfileItemVertical>) {
        this.dataSet = list
        notifyDataSetChanged()
        notifyItemInserted(dataSet.size - 1)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}