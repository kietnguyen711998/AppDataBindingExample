package com.example.appdatabindingexample.view.articleDetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.appdatabindingexample.models.Article
import java.lang.IllegalArgumentException

class ArticleDetailViewModelFactory(val article: Article?) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ArticleDetailViewModel::class.java))
            return ArticleDetailViewModel(article = article) as T

        throw IllegalArgumentException("Unkonwn ViewModel class")
    }

}