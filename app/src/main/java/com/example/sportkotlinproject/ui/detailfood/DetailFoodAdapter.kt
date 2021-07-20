package com.example.sportkotlinproject.ui.detailfood

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sportkotlinproject.pojo.FoodGroup

class DetailFoodAdapter: RecyclerView.Adapter<DetailFoodAdapter.MyViewHolder>() {

    private lateinit var list: MutableList<FoodGroup?>
    fun sendFoodAdapter(foodGroup: MutableList<FoodGroup?>){
        this.list = foodGroup

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return list.size
    }
    class MyViewHolder(item: View): RecyclerView.ViewHolder(item) {

    }
}