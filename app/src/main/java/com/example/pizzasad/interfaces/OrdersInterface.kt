package com.example.pizzasad.interfaces

import com.example.pizzasad.model.ApiResponseOrders
import com.example.pizzasad.model.Orders

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface OrdersInterface {
    @Headers("Content-Type:application/json")
    @GET("/orders")
    fun getAllOrders(): Call<ApiResponseOrders>
    @Headers("Content-Type:application/json")
    @GET("/orders/{id}")
    fun getAllOrdersById(@Path("id") id:Int): Call<Orders>
}