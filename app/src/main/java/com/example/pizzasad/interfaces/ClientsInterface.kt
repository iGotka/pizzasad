package com.example.pizzasad.interfaces

import com.example.pizzasad.model.ApiResponseClients
import com.example.pizzasad.model.Clients
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface ClientsInterface {
    @Headers("Content-Type:application/json")
    @GET("/clients")
fun getAllClients(): Call<ApiResponseClients>
    @Headers("Content-Type:application/json")
    @GET("/clients/{id}")
    fun getAllClientsById(@Path("id") id:Int): Call<Clients>
}