package com.kittenls.delapi.openapi.network.data

import com.google.gson.annotations.SerializedName

data class Meal(
    val idMeal: Long,
    val strMeal: String,
    val strCategory: String,
    val strArea: String,
    val strMealThumb: String
)

data class Meals(
        val meals: List<Meal>
)

data class MealCategory(
        val idCategory : Int,
        val strCategory: String,
        val strCategoryThumb: String,
        val strCategoryDescription: String
)

data class MealCategories(
        @SerializedName("categories")
        val mealCategories: List<MealCategory>
)