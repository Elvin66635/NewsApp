package com.example.newsapp.ui.favorites

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.data.api.NewsRepository
import com.example.newsapp.models.Article
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(private val repository: NewsRepository) : ViewModel() {

    init {
        getSavedArticles()
    }

    fun getSavedArticles() = repository.getFavoriteArticles()

    fun deleteArticle(article: Article) = viewModelScope.launch {
        repository.deleteFromFavorite(article)
    }

    fun saveArticle(article: Article) = viewModelScope.launch {
        repository.addToFavorite(article)
    }
}