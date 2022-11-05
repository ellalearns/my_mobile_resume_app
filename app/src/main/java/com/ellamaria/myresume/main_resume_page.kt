package com.ellamaria.myresume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class main_resume_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonKnowMore)

        button.setOnClickListener {
            val intent = Intent(this,details::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.custom_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.back -> {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                return true
            }
            else -> {
                return false
            }
        }

        return super.onOptionsItemSelected(item)
    }
}