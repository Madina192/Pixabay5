package com.example.pixabay5

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixaApi {
    @GET("api/")
    fun getPictures(
        @Query("q") keyWord: String,
        @Query("key") key: String = "38419248-534f53ef765c278655a0fd6be",
        @Query("per_page") perPage: Int = 3,
        @Query("page") page: Int
    ): Call<PixaModel>
}