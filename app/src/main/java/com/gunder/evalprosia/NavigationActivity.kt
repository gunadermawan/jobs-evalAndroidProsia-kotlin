package com.gunder.evalprosia

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.gunder.evalprosia.databinding.ActivityNavigationBinding
import com.gunder.evalprosia.utils.Prefs

class NavigationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_navigation)
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        navView.setOnItemReselectedListener {
            if (it.itemId == R.id.navigation_notifications) {
                val sharedPreferences = Prefs(this)
                if (sharedPreferences.getIsLogin()) {
                    Log.d("NAV ACTIVITY", "login user using sharePref")
                } else {
                    Log.d("NAV ACTIVITY", "notification not clicked, move to another menu")
                }
            } else {
                Log.d("NAV ACTIVITY", "notification not clicked")
            }
            return@setOnItemReselectedListener
        }
    }
}