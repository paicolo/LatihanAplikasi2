package com.example.latihanaplikasi2.ui

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.latihanaplikasi2.model.Article
import com.example.latihanaplikasi2.network.Api
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {
    val newsUiState: List<Article> by mutableStateOf(listOf())
    init {
        println("Kepanggil")
        getListNews()
    }
    fun getListNews(){
        viewModelScope.launch {
            val response = Api.newsAPIService.getTopHeadline()
            val articles = response.articles

            articles.forEach{
                article: Article ->
                println(article.toString())
                Log.d("response", article.toString())

            }
            newsUiState = response.articles
        }
    }
}