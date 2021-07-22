package com.example.sportkotlinproject.ui.detailfood

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.SeekBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sportkotlinproject.R
import com.example.sportkotlinproject.pojo.Dish
import kotlin.math.absoluteValue

class DetailFoodAdapter : RecyclerView.Adapter<DetailFoodAdapter.MyViewHolder>(), SeekBar.OnSeekBarChangeListener {

    private lateinit var listProducts: List<Dish>
    private var myViewHolder: MyViewHolder? = null
    var resultSeekBar = 0
    fun sendFoodAdapter(list: List<Dish>) {
        this.listProducts = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_rv_detail_food_adapter, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvNameProduct.text = listProducts[position].nameDish
        holder.linearHideSeekBar.visibility = View.GONE
        holder.tvNameProduct.setOnClickListener {
            holder.linearHideSeekBar.visibility = View.VISIBLE
        }
        holder.seekBar.setOnSeekBarChangeListener(this)
        holder.tvResultSeekBar.text = resultSeekBar.toString()
    }

    override fun getItemCount(): Int {
        return listProducts.size
    }

    class MyViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val tvNameProduct: TextView = item.findViewById(R.id.tvNameProduct)
        val seekBar: SeekBar = item.findViewById(R.id.seekBar)
        val linearHideSeekBar: LinearLayout = item.findViewById(R.id.linearHideSeekBar)
        val tvResultSeekBar: TextView = item.findViewById(R.id.tvResultSeekBar)
    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        progress.absoluteValue
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {

    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        if (seekBar != null) {
            resultSeekBar = seekBar.progress
            notifyDataSetChanged()
        }
    }
}