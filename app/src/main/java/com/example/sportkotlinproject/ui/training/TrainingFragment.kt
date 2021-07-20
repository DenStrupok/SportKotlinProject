package com.example.sportkotlinproject.ui.training

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sportkotlinproject.R
import com.example.sportkotlinproject.interfaces.OnBodyItemClickListener
import com.example.sportkotlinproject.pojo.Body
import com.example.sportkotlinproject.pojo.BodyFactory
import com.example.sportkotlinproject.ui.detailtrainig.DetailTrainingFragment.Companion.PART_BODY

class TrainingFragment : Fragment(), OnBodyItemClickListener {

    private lateinit var galleryViewModel: TrainingViewModel
    private lateinit var recyclerBody: RecyclerView
    private lateinit var navController: NavController

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        galleryViewModel =
                ViewModelProvider(this).get(TrainingViewModel::class.java)
        val view: View = inflater.inflate(R.layout.fragment_training, container, false)
        galleryViewModel.text.observe(viewLifecycleOwner, Observer {

        })
        recyclerBody = view.findViewById(R.id.recyclerBody)
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
        val adapter  = TrainingAdapter(this)
        val listBody = createListPartBody()
        adapter.sentListAdapter(listBody)
        recyclerBody.adapter = adapter
        recyclerBody.layoutManager = GridLayoutManager(requireContext(), 2)
        return view

    }
    private fun createListPartBody(): MutableList<Body?> {
        val back = BodyFactory.createPartBody("Back")
        val chest = BodyFactory.createPartBody("Chest")
        val triceps = BodyFactory.createPartBody("Triceps")
        val biceps = BodyFactory.createPartBody("Biceps")
        val legs = BodyFactory.createPartBody("Legs")
        val press = BodyFactory.createPartBody("Press")
        val shoulders = BodyFactory.createPartBody("Shoulders")
        val cardio = BodyFactory.createPartBody("Cardio")
        return mutableListOf(back, chest, biceps, press, shoulders, legs, cardio, triceps)
    }

    override fun onBodyItemClicked(partBody: Body) {
        val bundle = Bundle()
        bundle.putParcelable(PART_BODY, partBody)
        navController.navigate(R.id.detailTrainingFragment, bundle)

    }
}