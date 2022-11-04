package com.example.retroexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testRetro()
    }

    private fun testRetro() {
        thread {
            val topMovies = MovieDbClient.service.listTopRatedMovies("d48528e9c283144460d86c435d310808")
            val body = topMovies.execute().body()
            if (body != null)
                Log.d("MainActivity", "Movie count: ${body.results.size}")
        }

    }

}