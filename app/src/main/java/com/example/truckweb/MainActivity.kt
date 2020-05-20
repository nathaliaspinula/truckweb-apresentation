package com.example.truckweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutUs = findViewById<ImageButton>(R.id.aboutUsButton)
        aboutUs.setOnClickListener{
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }

        val client = findViewById<ImageButton>(R.id.clientButton)
        client.setOnClickListener{
        val intent = Intent(this, Clients::class.java)
           startActivity(intent)
        }

        val products = findViewById<ImageButton>(R.id.productsButton)
        products.setOnClickListener{
            val intent = Intent(this, Products::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId;
        if (id == R.id.nossos_clientes_action) {
            val intent = Intent(this, Clients::class.java)
            startActivity(intent)
        } else if (id == R.id.nossos_produtos_action) {
            val intent = Intent(this, Products::class.java)
            startActivity(intent)
        } else if (id == R.id.quem_somos_action) {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        } else {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
