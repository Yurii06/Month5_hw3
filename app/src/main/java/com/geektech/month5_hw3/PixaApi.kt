package com.geektech.month5_hw3

import com.geektech.month5_hw3.model.PixaModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixaApi {
    @GET("api/")
    fun getPictures(
        @Query("q") keyWord: String,
        @Query("key") key: String = "38417785-507eddc986652ce6209c1eb8d",
        @Query("per_page") perPage: Int = 3,
        @Query("page") page: Int
    ): Call<PixaModel>
}