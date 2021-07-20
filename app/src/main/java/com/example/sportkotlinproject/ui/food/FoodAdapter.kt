package com.example.sportkotlinproject.ui.food

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sportkotlinproject.R
import com.example.sportkotlinproject.pojo.FoodGroup

class FoodAdapter: RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    lateinit var listFood: MutableList<FoodGroup?>

    fun sendFoodGroupAdapter(listFoodGroup: MutableList<FoodGroup?>) {
        this.listFood = listFoodGroup
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_recycler_food_group, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvNameFoodGroupAdapter.text = listFood[position]?.nameFoodGroup
        Glide.with(holder.imgAdapterFood).load(listFood[position]?.imgFoodGroup).into(holder.imgAdapterFood)
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemClickFoodAdapter: LinearLayout = itemView.findViewById(R.id.itemClickFoodAdapter)
        val imgAdapterFood: ImageView = itemView.findViewById(R.id.imgAdapterFood)
        val tvNameFoodGroupAdapter: TextView = itemView.findViewById(R.id.tvNameFoodGroupAdapter)
    }
}