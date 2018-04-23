package com.kittenls.delapi.openapi.activities.main.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kittenls.delapi.openapi.R
import com.kittenls.delapi.openapi.network.data.MealCategory


class MealAdapter(val meals: List<MealCategory>?): RecyclerView.Adapter<MealAdapter.MealCard>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealCard {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.meal_recycler_item, parent, false)
        return MealCard(v)
    }

    override fun getItemCount(): Int {
        return if(meals != null) meals.size else 0
    }

    override fun onBindViewHolder(holder: MealCard, position: Int) {
        holder.mealId.text = meals?.get(position)?.idCategory.toString()
        holder.mealName.text = meals?.get(position)?.strCategory
    }

    class MealCard(meal: View): RecyclerView.ViewHolder(meal){
        val mealId: TextView = meal.findViewById(R.id.idMeal)
        val mealName: TextView = meal.findViewById(R.id.mealTitle)

    }
}