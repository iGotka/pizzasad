package com.example.pizzasad.model

import com.google.gson.annotations.SerializedName

data class Orders( @SerializedName("id_order"   ) var idOrder   : Int?    = null,
                   @SerializedName("id_client"  ) var idClient  : ArrayList<Clients> = arrayListOf(),
                   @SerializedName("date_order" ) var dateOrder : String? = null,
                   @SerializedName("done"       ) var done      : Int?    = null,
                   @SerializedName("cost"       ) var cost      : Int?    = null,
                   @SerializedName("phone"      ) var phone     : String? = null,
                   @SerializedName("address"    ) var address   : String? = null)
data class ApiResponseOrders(
    @SerializedName("orders") var orders      : ArrayList<Orders> = arrayListOf(),
    @SerializedName("success"      ) var success     : String? = null
)

