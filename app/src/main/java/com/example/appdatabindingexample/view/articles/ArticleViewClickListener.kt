package com.example.appdatabindingexample.view.articles

import com.example.appdatabindingexample.models.Article

interface ArticleViewClickListener {
    fun onArticleClick(article: Article)
}