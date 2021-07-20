package com.example.sportkotlinproject.ui.food

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sportkotlinproject.R
import com.example.sportkotlinproject.pojo.FoodFactory
import com.example.sportkotlinproject.pojo.FoodGroup

class FoodFragment : Fragment() {


    private lateinit var recyclerFoodGroup: RecyclerView
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_food, container, false)
        recyclerFoodGroup = view.findViewById(R.id.recyclerFoodGroup)
        val listFoodGroup = createFoodsGroup()
        val foodAdapter = FoodAdapter()
            foodAdapter.sendFoodGroupAdapter(listFoodGroup)
            recyclerFoodGroup.layoutManager = GridLayoutManager(requireContext(), 2)
        recyclerFoodGroup.adapter = foodAdapter

        return view
    }
    private fun createFoodsGroup(): MutableList<FoodGroup?> {
        val vegetables = FoodFactory.createFoodGroup("Vegetables")
        val fruits = FoodFactory.createFoodGroup("Fruits")
        val beansAndNuts = FoodFactory.createFoodGroup("Beans and Nuts")
        val meat = FoodFactory.createFoodGroup("Meat")
        val fish = FoodFactory.createFoodGroup("Fish")
        val dairyFoods = FoodFactory.createFoodGroup("Dairy Foods")
        val sweets = FoodFactory.createFoodGroup("Sweets")
        return mutableListOf(vegetables, fruits, beansAndNuts, meat, fish, dairyFoods, sweets)
    }
}