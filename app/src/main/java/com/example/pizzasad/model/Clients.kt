package com.example.pizzasad.model

import com.google.gson.annotations.SerializedName

data class Clients(  @SerializedName("id_client"   ) var idClient   : Int?    = null,
                     @SerializedName("phone"       ) var phone      : String? = null,
                     @SerializedName("address"     ) var address    : String? = null,
                     @SerializedName("code_region" ) var codeRegion : Int?    = null)
data class ApiResponseClients(
    @SerializedName("clients"     ) var clients     : ArrayList<Clients> = arrayListOf(),
    @SerializedName("success"      ) var success     : String? = null
)
