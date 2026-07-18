package com.example.nefis

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categories = VideoRepository.getCategories()
        val rvCategories = findViewById<RecyclerView>(R.id.rvCategories)
        
        rvCategories.adapter = CategoryAdapter(categories) { category ->
            val intent = Intent(this, CategoryActivity::class.java).apply {
                putExtra("category_name", category.name)
                putParcelableArrayListExtra("videos", ArrayList(category.videos))
            }
            startActivity(intent)
        }
    }
}
