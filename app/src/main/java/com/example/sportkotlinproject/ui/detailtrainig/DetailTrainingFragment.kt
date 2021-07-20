package com.example.sportkotlinproject.ui.detailtrainig

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.sportkotlinproject.MainActivity.Companion.TAG
import com.example.sportkotlinproject.R
import com.example.sportkotlinproject.interfaces.UsedCaloriesTraining
import com.example.sportkotlinproject.pojo.Body

class DetailTrainingFragment : Fragment(), UsedCaloriesTraining {
    companion object {
        const val PART_BODY: String = "part body"
    }

    private lateinit var tvResultCalories: TextView
    var listUsedCalorie: MutableList<Int>? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listUsedCalorie  = mutableListOf()
    }
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detail_training, container, false)
        tvResultCalories = view.findViewById(R.id.tvResultCalories)
        val partBody = arguments?.getParcelable<Body>(PART_BODY)
        val recyclerDetailTraining: RecyclerView = view.findViewById(R.id.recyclerDetailTraining)
        val listExercise = partBody?.listExercise
        val detailTrainingAdapter = DetailTrainingAdapter(this)
        recyclerDetailTraining.adapter = detailTrainingAdapter
        listExercise?.let { detailTrainingAdapter.sendListDetailFragment(it) }
        return view
    }

    @SuppressLint("SetTextI18n")
    override fun sumUsedCalories(calories: Int) {
        listUsedCalorie?.add(calories)
        var result = 0
        listUsedCalorie?.forEach {
            result += calories
        }
        tvResultCalories.text = "Used calories: $result"
    }
}