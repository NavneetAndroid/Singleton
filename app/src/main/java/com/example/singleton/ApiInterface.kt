package com.example.singleton

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
interface ApiInterface {
    @GET("volley_array.json")
    fun getMovies(): Call<List<Movie>>

    object ApiService {
        val apiInstance:ApiInterface
        var BASE_URL = "http://velmm.com/apis/"
        init {
            val retrofit=Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            apiInstance=retrofit.create(ApiInterface::class.java)
        }
    }
}