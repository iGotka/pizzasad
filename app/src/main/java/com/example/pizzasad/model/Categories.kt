package com.example.pizzasad.model

import android.icu.text.CaseMap.Title
import com.google.gson.annotations.SerializedName

data class Categories(
    @SerializedName("id_category" ) var id : Int?    = null,
    @SerializedName("category"    ) var title : String? = null)
data class ApiResponseCategories<T>(
    @SerializedName("categories"  ) var categories  : ArrayList<T> = arrayListOf(),
    @SerializedName("success"      ) var success     : String? = null
)