package com.kittenls.delapi.openapi.activities.main.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.facebook.drawee.drawable.ProgressBarDrawable
import com.facebook.drawee.view.SimpleDraweeView
import com.kittenls.delapi.openapi.R
import com.kittenls.delapi.openapi.activities.main.detail.DetailActivityPresenter
import com.kittenls.delapi.openapi.network.data.Meals


class DetailMealAdapter(val meals: Meals?, val presenter: DetailActivityPresenter): RecyclerView.Adapter<DetailMealAdapter.MealListItemCard>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealListItemCard {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.meal_list_recycler_item, parent, false)
        return MealListItemCard(v)
    }

    override fun getItemCount(): Int {
        return meals?.mealsList?.size ?: 0
    }

    override fun onBindViewHolder(holder: MealListItemCard, position: Int) {
        val meal = meals?.mealsList?.get(position)
        //holder.itemView.setOnClickListener{_ ->  presenter.categoryItemClick(meal?.idMeal) }
        holder.mealId.text = meal?.idMeal.toString()
        holder.mealName.text = meal?.strMeal
        holder.mealImage.hierarchy.setProgressBarImage(ProgressBarDrawable())
        holder.mealImage.setImageURI(meal?.strMealThumb)
    }

    class MealListItemCard(meal: View): RecyclerView.ViewHolder(meal){
        val mealId: TextView = meal.findViewById(R.id.meal_list_id)
        val mealName: TextView = meal.findViewById(R.id.meal_list_title)
        val mealImage: SimpleDraweeView = meal.findViewById(R.id.meal_list_detail_image)
    }
}