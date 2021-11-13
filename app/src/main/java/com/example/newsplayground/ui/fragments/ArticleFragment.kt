package com.example.newsplayground.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.newsplayground.R
import com.example.newsplayground.ui.NewsActivity
import com.example.newsplayground.ui.NewsViewModel

class ArticleFragment : Fragment(R.layout.fragment_article) {

    var viewModel: NewsViewModel? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}