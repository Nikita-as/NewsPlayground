package com.example.newsplayground.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.newsplayground.R
import com.example.newsplayground.db.ArticleDatabase
import com.example.newsplayground.repository.NewsRepository
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {

    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(newsRepository)

        viewModel = ViewModelProvider(this, viewModelProviderFactory)[NewsViewModel::class.java]

        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}