package com.kittenls.delapi.openapi.network.data

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