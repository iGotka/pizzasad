package com.example.pizzasad.interfaces
import com.example.pizzasad.model.ApiResponseProducts
import com.example.pizzasad.model.Products

import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface ProductsInterface {
    @Headers("Content-Type:application/json")
    @GET("/products")
    fun getAllProducts(): Call<ApiResponseProducts>
    @Headers("Content-Type:application/json")
    @GET("/products/{id}")
    fun getAllProductById(@Path("id") id:Int): Call<Products>
}