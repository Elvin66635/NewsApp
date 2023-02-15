package com.example.newsapp.utills

import com.example.newsapp.BuildConfig
import java.text.SimpleDateFormat
import java.util.*

class Constants {
    companion object {
        const val BASE_URL = "https://newsapi.org/"
        const val API_KEY = BuildConfig.API_KEY
        const val QUERY_PAGE_SIZE = 20
        const val pattern = "dd MMMM yyyy"
        val simpleDateFormat = SimpleDateFormat(pattern)
        val date: String = simpleDateFormat.format(Date())
    }
}