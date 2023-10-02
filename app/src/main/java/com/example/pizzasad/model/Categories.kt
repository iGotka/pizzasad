package com.example.pizzasad.model

import com.google.gson.annotations.SerializedName

data class Categories(
    @SerializedName("id_category" ) var idCategory : Int?    = null,
    @SerializedName("category"    ) var category   : String? = null)
data class ApiResponseCategories<T>(
    @SerializedName("categories"  ) var categories  : ArrayList<T> = arrayListOf(),
    @SerializedName("success"      ) var success     : String? = null
)