package com.artemissoftware.currencyconverter.data

import com.artemissoftware.currencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("/latest")
    suspend fun getRates(
        /*@Query("symbols") base: String,*/ @Query("access_key") accessKey: String = "2370b16a10f09b990710c947770c0cff"
    ): Response<CurrencyResponse>

}