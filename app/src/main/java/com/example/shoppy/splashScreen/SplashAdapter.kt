package com.example.shoppy.splashScreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppy.R

class SplashAdapter(private val splashData: List<Splash>): RecyclerView.Adapter<SplashViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SplashViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.splash_layout, parent, false)
        return SplashViewHolder(view)
    }

    override fun onBindViewHolder(holder: SplashViewHolder, position: Int) {
        holder.setData(splashData[position])
    }

    override fun getItemCount(): Int {
        return splashData.size
    }
}