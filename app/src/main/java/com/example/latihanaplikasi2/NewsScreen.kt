package com.example.latihanaplikasi2

import android.os.Bundle
import androidx.activity.viewModels
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.latihanaplikasi2.model.Article
import com.example.latihanaplikasi2.ui.NewsViewModel


@Composable
fun NewsApp(listArticle: List<Article>){
    LazyColumn{
        items(listArticle){ article ->
            NewsCard(article = article)
        }
    }
}

@Composable
fun NewsCard(article: Article){
    Card(elevation = 8.dp) {
        Column() {
            AsyncImage(model = article.urlToImage, contentDescription = "news Image")
    }
        Text(text = article.title)
    }
}
