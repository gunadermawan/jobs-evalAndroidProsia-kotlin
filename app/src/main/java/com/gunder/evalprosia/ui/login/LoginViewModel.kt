package com.gunder.evalprosia.ui.login

import androidx.lifecycle.ViewModel
import com.gunder.evalprosia.core.data.repository.AppRepository

class LoginViewModel(val repo: AppRepository) : ViewModel() {
    fun login() = repo.login()
}