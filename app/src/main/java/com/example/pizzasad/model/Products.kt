package com.example.pizzasad.model

import com.google.gson.annotations.SerializedName

data class Products(@SerializedName("id_product"   ) var idProduct   : Int?    = null,
                    @SerializedName("name_product" ) var nameProduct : String? = null,
                    @SerializedName("category_id"  ) var categoryId  : ArrayList<Categories> = arrayListOf(),
                    @SerializedName("description"  ) var description : String? = null,
                    @SerializedName("price"        ) var price       : Int?    = null,
                    @SerializedName("image"        ) var image       : String? = null
)
data class ApiResponseProducts(
@SerializedName("products") var products    : ArrayList<Products> = arrayListOf(),
@SerializedName("success"      ) var success     : String? = null
)
