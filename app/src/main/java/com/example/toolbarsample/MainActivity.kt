package com.example.toolbarsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toolbarsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupBinding()
        setupToolBar()

    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupToolBar() {
        val toolBar = binding.toolbar2
        toolBar.background = getDrawable(R.color.purple_200)
        setSupportActionBar(toolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}