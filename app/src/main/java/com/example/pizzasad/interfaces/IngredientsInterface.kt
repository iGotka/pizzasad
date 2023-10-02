package com.example.pizzasad.interfaces

import com.example.pizzasad.model.ApiResponseIngredients
import com.example.pizzasad.model.ApiResponseProducts
import com.example.pizzasad.model.Ingredients
import com.example.pizzasad.model.Products
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface IngredientsInterface {
    @Headers("Content-Type:application/json")
@GET("/ingredients")
fun getAllIngredients(): Call<ApiResponseIngredients>
    @Headers("Content-Type:application/json")
    @GET("/ingredients/{id}")
    fun getAllIngredientsById(@Path("id") id:Int): Call<Ingredients>
}