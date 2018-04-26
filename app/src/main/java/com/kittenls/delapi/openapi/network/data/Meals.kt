package com.kittenls.delapi.openapi.network.data

import com.google.gson.annotations.SerializedName

data class MealDetail(
        val idMeal: Long,
        val strMeal: String,
        val strCategory: String,
        val strArea: String,
        val strMealThumb: String
)

data class MealListItem(
        val strMeal: String,
        val strMealThumb: String,
        val idMeal: Int
)

data class Meals(
        @SerializedName("meals")
        val mealsList: List<MealListItem>
)

data class MealCategory(
        val idCategory: Int,
        val strCategory: String,
        val strCategoryThumb: String,
        val strCategoryDescription: String
)

data class MealCategories(
        @SerializedName("categories")
        val mealCategories: List<MealCategory>
)