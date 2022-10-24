package com.gunder.evalprosia.ui.notifications

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.gunder.evalprosia.databinding.FragmentNotificationsBinding
import com.gunder.evalprosia.ui.login.LoginActivity
import com.gunder.evalprosia.utils.Prefs

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this)[NotificationsViewModel::class.java]

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        mainButton()
        return binding.root
    }

    private fun mainButton() {
        val Prefs = Prefs(context as Activity)
        binding.button.setOnClickListener {
            Prefs.setIsLogin(false)
            startActivity(Intent(context as Activity, LoginActivity::class.java))
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}