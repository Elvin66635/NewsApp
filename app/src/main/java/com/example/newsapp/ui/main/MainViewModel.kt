package com.example.newsapp.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.data.api.NewsRepository
import com.example.newsapp.models.NewsResponse
import com.example.newsapp.utills.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: NewsRepository) : ViewModel() {
    val newsLiveData: MutableLiveData<Resource<NewsResponse>> = MutableLiveData()
    var newsPage = 1
    var breakingNewsPage = 1
    var breakingNewsResponse: NewsResponse? = null

    init {
        getNews("ru")
    }

    fun getNews(countryCode: String) =
        viewModelScope.launch {
            newsLiveData.postValue(Resource.Loading())
            val response = repository.getNews(countryCode = countryCode, pageNumber = newsPage)
            if (response.isSuccessful) {
                response.body().let { resultResponse ->
                    breakingNewsPage++
                    if (breakingNewsResponse == null) {
                        breakingNewsResponse = resultResponse
                    } else {
                        val oldArticles = breakingNewsResponse?.articles
                        val newArticles = resultResponse?.articles
                        if (newArticles != null) {
                            oldArticles?.addAll(newArticles)
                        }
                    }
                    newsLiveData.postValue(Resource.Success(breakingNewsResponse ?: resultResponse))
                }
            } else {
                newsLiveData.postValue(Resource.Error(message = response.message()))
            }
        }
}