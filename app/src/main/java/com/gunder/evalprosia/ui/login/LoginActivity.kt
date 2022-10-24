package com.gunder.evalprosia.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gunder.evalprosia.databinding.ActivityLoginBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {
    private val viewModel: LoginViewModel by viewModel()
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainButton()
    }

    private fun mainButton() {
        binding.btnLogin.setOnClickListener {
            viewModel.login()
        }
    }
}