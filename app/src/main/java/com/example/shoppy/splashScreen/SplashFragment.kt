package com.example.shoppy.splashScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.shoppy.R
import com.example.shoppy.databinding.FragmentSplashBinding

class SplashFragment : Fragment(), View.OnClickListener {

    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        setupSplashScreen(getSplashData())
        setupClicks()
        return binding.root
    }

    private fun setupSplashScreen(splashData: List<Splash>) {
        binding.appOpenPager.adapter = SplashAdapter(splashData)
    }

    private fun getSplashData(): List<Splash> {
        val list = mutableListOf<Splash>()

        list.add(Splash("Don't want to stand in queue", "Does it take time to get your item because your favourite shop is already loaded with customers or are you cautious of covid", R.raw.f))
        list.add(Splash("Order online with us", "Order from your favourite shop keepers around you", R.raw.b))
        list.add(Splash("Go and collect your item", "Pay online or at the shop", R.raw.e))
        return list
    }

    private fun setupClicks() {
        binding.sellerLogIn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            binding.sellerLogIn.id -> {
                Navigation.findNavController(binding.root).navigate(R.id.loginFragment)
            }
        }
    }
}

data class Splash(
    val title: String,
    val description: String,
    val lottie: Int,
)