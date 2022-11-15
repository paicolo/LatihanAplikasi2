package com.example.latihanaplikasi2.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.latihanaplikasi2.model.Article
import com.example.latihanaplikasi2.network.Api
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {
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
        }
    }
}