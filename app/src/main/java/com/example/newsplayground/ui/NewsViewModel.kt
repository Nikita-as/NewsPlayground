package com.example.newsplayground.ui

import androidx.lifecycle.ViewModel
import com.example.newsplayground.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}