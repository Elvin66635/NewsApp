package com.example.newsapp.utills

import java.text.SimpleDateFormat
import java.util.*

class Constants {
    companion object {
        const val BASE_URL = "https://newsapi.org/"
        const val API_KEY = "ac8c0c8932f44fc187bbfa5917eb1665"
        const val QUERY_PAGE_SIZE = 20
        const val pattern = "dd MMMM yyyy"
        val simpleDateFormat = SimpleDateFormat(pattern)
        val date: String = simpleDateFormat.format(Date())
    }


}