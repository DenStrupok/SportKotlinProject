package com.example.sportkotlinproject.ui.detailfood

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.sportkotlinproject.R
import com.example.sportkotlinproject.pojo.FoodGroup

class DetailFoodFragment: Fragment() {
    companion object{
        const val FOOD_GROUP = "food group"
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_detail_food, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerDetailFood)
        val food = arguments?.getParcelable<FoodGroup>(FOOD_GROUP)
        val listGroup = food?.list
        val detailFoodAdapter = DetailFoodAdapter()
        recyclerView.adapter = detailFoodAdapter
        listGroup?.let { detailFoodAdapter.sendFoodAdapter(it) }
        return view
    }
}