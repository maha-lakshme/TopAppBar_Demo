package com.maha.topappbar_demo


import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.color.MaterialColors
import com.google.android.material.shape.MaterialShapeDrawable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//       if (Build.VERSION.SDK_INT >= 21) {
//            getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.md_theme_light_surfaceVariant));
//            getWindow().setNavigationBarColor(ContextCompat.getColor(this,R.color.md_theme_light_inverseOnSurface));
//        }

        val appbar=findViewById<AppBarLayout>(R.id.appbar_layout)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = CustomAdapter()
        val data = listOf("text1", "text2", "text3","text1", "text2", "text3","text1", "text2", "text3","text1", "text2", "text3","text1", "text2", "text3","text1", "text2", "text3","text1", "text2", "text3"
            ,"text1", "text2", "text3")
        adapter.data = data
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.adapter = adapter


    }
}