package com.ellamaria.myresume

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton

class details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details)

        val liButton = findViewById<ImageButton>(R.id.imageButton7)
        val gmailButton = findViewById<ImageButton>(R.id.imageButton8)
        val gitButton = findViewById<ImageButton>(R.id.imageButton4)
        val buttonCall = findViewById<Button>(R.id.buttonCall)

        liButton.setOnClickListener{
            val openLi = Intent(android.content.Intent.ACTION_VIEW)
            openLi.data = Uri.parse("https://linkedin.com")
            startActivity(openLi)
        }

        gmailButton.setOnClickListener{
            val openGmail = Intent(android.content.Intent.ACTION_VIEW)
            openGmail.data = Uri.parse("mailto:ella333@gmail.com")
            startActivity(openGmail)
        }

        gitButton.setOnClickListener{
            val openGit = Intent(android.content.Intent.ACTION_VIEW)
            openGit.data = Uri.parse("https://github.com")
            startActivity(openGit)
        }

        buttonCall.setOnClickListener{
            val openCall = Intent(android.content.Intent.ACTION_VIEW)
            openCall.data = Uri.parse("tel:03032233110")
            startActivity(openCall)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.custom_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.back -> {
                val intent = Intent(this,main_resume_page::class.java)
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