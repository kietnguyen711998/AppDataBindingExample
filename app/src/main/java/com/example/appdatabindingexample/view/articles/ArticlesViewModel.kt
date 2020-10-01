package com.example.appdatabindingexample.view.articles

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appdatabindingexample.data.ArticlesUtil
import com.example.appdatabindingexample.models.Article

class ArticlesViewModel : ViewModel() {
    private val _articles = MutableLiveData<List<Article>>()
    val articles: LiveData<List<Article>> = _articles

    init {
        loadArticles()
    }

    private fun loadArticles() {
        _articles.value = ArticlesUtil.articles
    }

}