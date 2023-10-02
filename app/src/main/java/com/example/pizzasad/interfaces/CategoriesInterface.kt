package com.example.pizzasad.interfaces

import com.example.pizzasad.model.ApiResponseCategories

import com.example.pizzasad.model.Categories

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface CategoriesInterface {
    @Headers("Content-Type:application/json")
    @GET("/categories")
    fun getAllCategories(): Call<ApiResponseCategories>
    @Headers("Content-Type:application/json")
    @GET("/categories/{id}")
    fun getAllCategoriesById(@Path("id") id:Int): Call<Categories>
}