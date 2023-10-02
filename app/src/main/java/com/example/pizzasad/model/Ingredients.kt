package com.example.pizzasad.model

import com.google.gson.annotations.SerializedName

data class Ingredients(@SerializedName("ingredient_id"    ) var ingredientId    : Int?    = null,
                       @SerializedName("ingredient_name"  ) var ingredientName  : String? = null,
                       @SerializedName("ingredient_cost"  ) var ingredientCost  : Int?    = null,
                       @SerializedName("ingredient_photo" ) var ingredientPhoto : String? = null)
data class ApiResponseIngredients(
    @SerializedName("ingredients" ) var ingredients : ArrayList<Ingredients> = arrayListOf(),
    @SerializedName("success"      ) var success     : String? = null
)