package com.example.nefis

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView

class CategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val categoryName = intent.getStringExtra("category_name") ?: "Categoría"
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.title = categoryName
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { finish() }

        val videos = intent.getParcelableArrayListExtra<Video>("videos") ?: arrayListOf()

        val rvVideos = findViewById<RecyclerView>(R.id.rvVideos)
        rvVideos.adapter = VideoAdapter(videos) { video ->
            val intent = Intent(this, PlayActivity::class.java).apply {
                putExtra(PlayActivity.MOVIE_EXTRA, video)
            }
            startActivity(intent)
        }
    }
}
