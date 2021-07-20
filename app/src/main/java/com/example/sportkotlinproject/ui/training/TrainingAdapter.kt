package com.example.sportkotlinproject.ui.training

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sportkotlinproject.R
import com.example.sportkotlinproject.interfaces.OnBodyItemClickListener
import com.example.sportkotlinproject.pojo.Body

class TrainingAdapter(val listener: OnBodyItemClickListener): RecyclerView.Adapter<TrainingAdapter.ViewHolder>() {

    private lateinit var listBody: MutableList<Body?>

     fun sentListAdapter(list: MutableList<Body?>){
        this.listBody = list
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrainingAdapter.ViewHolder {
        val itemView: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_recycler_body, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TrainingAdapter.ViewHolder, position: Int) {
        holder.tvNamePart.text = listBody[position]?.namePartBody
        Glide.with(holder.imgBody).load(listBody[position]?.imgPartBody).into(holder.imgBody)
        holder.itemClick.setOnClickListener {

            val body = listBody[position]
            body?.let {
                it1 -> listener.onBodyItemClicked(it1)
            }
        }
    }

    override fun getItemCount(): Int {
        return listBody.size
    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imgBody: ImageView = itemView.findViewById(R.id.imgAdapterBody)
        val tvNamePart: TextView = itemView.findViewById(R.id.tvNamePartBodyAdapter)
        val itemClick: LinearLayout = itemView.findViewById(R.id.itemClickAdapter)
    }
}