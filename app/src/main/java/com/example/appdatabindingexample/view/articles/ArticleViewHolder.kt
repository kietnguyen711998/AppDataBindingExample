package com.example.appdatabindingexample.view.articles

import androidx.recyclerview.widget.RecyclerView
import com.example.appdatabindingexample.databinding.ListItemArticleBinding
import com.example.appdatabindingexample.models.Article

class ArticleViewHolder(
    private val binding: ListItemArticleBinding,
    itemClickListener: ArticleViewClickListener
) : RecyclerView.ViewHolder(binding.root) {
    init {
        binding.itemClickListener = itemClickListener
    }

    fun bind(article: Article) {
        binding.article = article
    }
}