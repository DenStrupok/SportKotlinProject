package com.example.sportkotlinproject

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Color.WHITE
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.sportkotlinproject.pojo.User
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var navController: NavController
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView
    lateinit var headerView: View
    companion object{
        const val USER = "user"
        const val TAG = "myTag"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)
        navController = findNavController(R.id.nav_host_fragment)
        initUser()
        initImgDrawerHeader()
        appBarConfiguration = AppBarConfiguration(setOf(
                R.id.nav_home, R.id.nav_training, R.id.nav_food), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        navView.setNavigationItemSelectedListener(this)
    }

    private fun initImgDrawerHeader() {
        val imgDrawerHeader: ImageView = headerView.findViewById(R.id.imgDrawerHeader)
        val btnPlusHeader: Button = headerView.findViewById(R.id.btnPlusHeader)
        if (imgDrawerHeader == null){
            btnPlusHeader.visibility = View.VISIBLE
        }else btnPlusHeader.visibility = View.GONE
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.nav_home -> navController.navigate(R.id.nav_home)
            R.id.nav_training -> navController.navigate(R.id.nav_training)
            R.id.nav_food -> navController.navigate(R.id.nav_food)
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
    @SuppressLint("SetTextI18n")
    private fun initUser(){
        val user: User? = intent.getParcelableExtra(USER)
        headerView = navView.getHeaderView(0)
        val tvHeaderName: TextView = headerView.findViewById(R.id.tvHeaderName)
        tvHeaderName.text = "Name "
        val tvHeaderFamily: TextView = headerView.findViewById(R.id.tvHeaderFamily)
        tvHeaderFamily.text = "Family: ${user?.family?.get(0)}"
    }
}