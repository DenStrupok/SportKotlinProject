package com.example.sportkotlinproject.ui.detailtrainig

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.sportkotlinproject.R
import com.example.sportkotlinproject.interfaces.UsedCaloriesTraining
import com.example.sportkotlinproject.pojo.Exercise


class DetailTrainingAdapter(val listenerItem: UsedCaloriesTraining) :
        RecyclerView.Adapter<DetailTrainingAdapter.MyViewHolder>(), View.OnClickListener {

    var countResultSet: Int = 0
    var countResultIteration: Int = 0
    lateinit var listExercise: List<Exercise>
    var exercise: Exercise? = null
    lateinit var myViewHolder: MyViewHolder

    fun sendListDetailFragment(list: List<Exercise>) {
        this.listExercise = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int,
    ): DetailTrainingAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_recycler_detail_training, parent, false)

        return MyViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: DetailTrainingAdapter.MyViewHolder, position: Int) {
        val isCheckedItem = listExercise[position].isCheckedExercise
        myViewHolder = holder
        holder.tvNameExercise.text = listExercise[position].nameExercise
        holder.imgDone.visibility = View.GONE
        holder.imgButtonSetPlus.setOnClickListener(this)
        holder.imgButtonSetMinus.setOnClickListener(this)
        holder.imgButtonIterationMinus.setOnClickListener(this)
        holder.imgButtonIterationPlus.setOnClickListener(this)
        holder.tvSetResult.text = countResultSet.toString()
        holder.tvIterationResult.text = countResultIteration.toString()
        holder.btnSubmitExercise.setOnClickListener(this)
        holder.childItemContainer.visibility = if (isCheckedItem) View.VISIBLE else View.GONE
        holder.itemClick.setOnClickListener{
            exercise = listExercise[position]
            exercise!!.isCheckedExercise = !exercise!!.isCheckedExercise
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int {
        return listExercise.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNameExercise: TextView = itemView.findViewById(R.id.tvNameExercise)
        val itemClick: LinearLayout = itemView.findViewById(R.id.itemClickDetailTraining)
        val childItemContainer: ConstraintLayout = itemView.findViewById(R.id.childItemContainer)
        val imgButtonSetMinus: ImageView = itemView.findViewById(R.id.imgButtonSetMinus)
        val tvSetResult: TextView = itemView.findViewById(R.id.tvSetResult)
        val imgButtonSetPlus: ImageView = itemView.findViewById(R.id.imgButtonSetPlus)
        val imgButtonIterationMinus: ImageView = itemView.findViewById(R.id.imgButtonIterationMinus)
        val tvIterationResult: TextView = itemView.findViewById(R.id.tvIterationResult)
        val imgButtonIterationPlus: ImageView = itemView.findViewById(R.id.imgButtonIterationPlus)
        val btnSubmitExercise: CheckBox = itemView.findViewById(R.id.btnSubmitExercise)
        val imgDone: ImageView = itemView.findViewById(R.id.imgDone)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.imgButtonSetPlus -> {
                countResultSet++
                notifyDataSetChanged()
            }
            R.id.imgButtonSetMinus -> {
                countResultSet--
                notifyDataSetChanged()
            }
            R.id.imgButtonIterationPlus -> {
                countResultIteration++
                notifyDataSetChanged()
            }
            R.id.imgButtonIterationMinus -> {
                countResultIteration--
                notifyDataSetChanged()
            }
            R.id.btnSubmitExercise -> {
                val set = countResultSet
                val iteration = countResultIteration
                val usingCalories = sumCalories(set, iteration)
                listenerItem.sumUsedCalories(usingCalories)
                myViewHolder.childItemContainer.visibility = View.GONE
                myViewHolder.imgDone.visibility = View.VISIBLE
                countResultSet = 0
                countResultIteration = 0
            }
        }
    }

    fun sumCalories(set: Int, iteration: Int): Int {
        return ((set * iteration) * 1.2).toInt()
    }
}