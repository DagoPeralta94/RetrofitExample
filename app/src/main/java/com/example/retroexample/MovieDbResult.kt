package com.example.retroexample

data class MovieDbResult(
    val page: Int,
    val results: List<MovieDb>,
    val total_pages: Int,
    val total_results: Int
)
