package com.artemissoftware.currencyconverter.util

sealed class Resource<T>(val data: T?, val message: String?) {

    class Success<T>(data: T): Resource<T>(data, message = null)
    class Error<T>(message: String): Resource<T>(data = null, message = message)
}