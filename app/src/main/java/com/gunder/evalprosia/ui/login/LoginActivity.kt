package com.gunder.evalprosia.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.gunder.evalprosia.NavigationActivity
import com.gunder.evalprosia.databinding.ActivityLoginBinding
import com.gunder.evalprosia.utils.Prefs

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val prefs = Prefs(this)
        if (prefs.getIsLogin()) {
            startActivity(Intent(this, NavigationActivity::class.java))
        } else {
            Toast.makeText(this, "not login!", Toast.LENGTH_SHORT).show()
        }
        binding.btnLogin.setOnClickListener {
            prefs.setIsLogin(true)
            onBackPressed()
        }
    }
}