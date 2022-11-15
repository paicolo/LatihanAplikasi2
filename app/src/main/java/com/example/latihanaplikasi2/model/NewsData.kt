package com.example.latihanaplikasi2.model

data class NewsData(
    val articles : List<Article>,
    val status: String,
    val totalResult: Int
)