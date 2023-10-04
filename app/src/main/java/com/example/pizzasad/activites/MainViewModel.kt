package com.example.pizzasad.activites

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pizzasad.datasource.ServiceBuilder
import com.example.pizzasad.interfaces.CategoriesInterface
import com.example.pizzasad.interfaces.ProductsInterface
import com.example.pizzasad.model.ApiResponseCategories
import com.example.pizzasad.model.Categories
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MenuViewModel : ViewModel() {
    private val _categoriesList = MutableLiveData<List<Categories>>()
    //LiveData — это класс держателя данных, который позволяет использовать
    // данные в течение заданного жизненного цикла.
    val categoriesList: LiveData<List<Categories>> = _categoriesList
    init {
        // вызывается автоматически при создании модели представления
        loadALlCategories()
    }
    private fun loadALlCategories() {
        val retrofit =
            ServiceBuilder.buildService(CategoriesInterface::class.java)
        // загрузка данных с помощью retrofit
        retrofit.getAllCategories().enqueue(object :
            Callback<ApiResponseCategories<Categories>> {
            override fun onResponse(
                call: Call<ApiResponseCategories<Categories>>,
                response: Response<ApiResponseCategories<Categories>>
            ) {
                try {
                    val responseBody = response.body()!!
                    // save data and post them to ui
                    _categoriesList.value = responseBody.categories
                } catch (ex: java.lang.Exception) {
                    ex.printStackTrace()
                }

            }

            override fun onFailure(call: Call<ApiResponseCategories<Categories>>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}