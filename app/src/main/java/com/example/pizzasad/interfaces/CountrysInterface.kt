package com.example.pizzasad.interfaces
import com.example.pizzasad.model.ApiResponseCountrys
import com.example.pizzasad.model.Countrys

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface CountrysInterface {
    @Headers("Content-Type:application/json")
    @GET("/countrys")
    fun getAllCountrys(): Call<ApiResponseCountrys>
    @Headers("Content-Type:application/json")
    @GET("/countrys/{id}")
    fun getAllCountrysById(@Path("id") id:Int): Call<Countrys>
}