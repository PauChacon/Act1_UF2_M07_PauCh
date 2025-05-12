package com.example.projecte_m07

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val menuButton = findViewById<ImageView>(R.id.buttonMenu)
        val navigationView = findViewById<NavigationView>(R.id.navigation_view)

        menuButton.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.END)
        }

        // Listener de los ítems del menú
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_settings -> {
                    startActivity(Intent(this, Ajustes::class.java))
                    true
                }
                R.id.nav_terms -> {
                    startActivity(Intent(this, TerminosDeUso::class.java))
                    true
                }
                else -> false
            }.also {
                drawerLayout.closeDrawer(GravityCompat.END)
            }
        }
    }
}
