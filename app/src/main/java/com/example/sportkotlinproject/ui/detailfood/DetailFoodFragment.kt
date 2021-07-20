package com.example.sportkotlinproject.ui.detailfood

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.sportkotlinproject.R

class DetailFoodFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_detail_food, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerDetailFood)
        return view
    }
}