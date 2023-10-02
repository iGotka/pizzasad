package com.example.pizzasad.model

import com.google.gson.annotations.SerializedName

data class Countrys(
    @SerializedName("country_code" ) var countryCode : Int?    = null,
    @SerializedName("country_name" ) var countryName : String? = null,
    @SerializedName("country_logo" ) var countryLogo : String? = null)

data class ApiResponseCountrys(
    @SerializedName("countrys") var countrys     : ArrayList<Countrys> = arrayListOf(),
    @SerializedName("success"      ) var success     : String? = null
)
