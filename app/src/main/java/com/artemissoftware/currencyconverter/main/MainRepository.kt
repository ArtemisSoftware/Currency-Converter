package com.artemissoftware.currencyconverter.main

import com.artemissoftware.currencyconverter.data.models.CurrencyResponse
import com.artemissoftware.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>

}