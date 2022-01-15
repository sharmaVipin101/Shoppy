package com.example.shoppy.seller.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shoppy.databinding.FragmentSellerDashboardBinding
import com.google.firebase.auth.FirebaseAuth

class SellerDashboard : Fragment(), View.OnClickListener {
    private lateinit var binding: FragmentSellerDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSellerDashboardBinding.inflate(inflater, container, false)
        setupClickListener()
        return binding.root
    }

    private fun setupClickListener() {
        binding.signOut.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            binding.signOut.id -> {
                signoutUser()
            }
        }
    }

    private fun signoutUser() {
        FirebaseAuth.getInstance().signOut()
    }

}