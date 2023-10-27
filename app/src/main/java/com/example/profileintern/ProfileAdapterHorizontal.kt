package com.example.profileintern

import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapterHorizontal(var dataSet : List<ProfileItemHorizontal> = emptyList()) : RecyclerView.Adapter<ProfileAdapterHorizontal.viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapterHorizontal.viewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.profile_horizontal_layout, parent, false)
        return viewHolder(view)
    }

    inner class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var profilePicture = itemView.findViewById<ImageView>(R.id.profile_picture)
        var firstName  = itemView.findViewById<TextView>(R.id.name)
        var lastName = itemView.findViewById<TextView>(R.id.message)
    }

    override fun onBindViewHolder(holder: ProfileAdapterHorizontal.viewHolder, position: Int) {
        var item = dataSet[position]
        holder.firstName.text = item.firstName
        holder.profilePicture.setImageResource(item.imageId)
        holder.lastName.text = item.lastName
    }

    fun updateList(list: List<ProfileItemHorizontal>) {
        this.dataSet = list
        notifyDataSetChanged()
        notifyItemInserted(dataSet.size - 1)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}