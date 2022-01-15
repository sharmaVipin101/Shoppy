package com.example.shoppy.splashScreen

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView
import com.example.shoppy.R
import com.google.android.material.textview.MaterialTextView

class SplashViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val title = itemView.findViewById<MaterialTextView>(R.id.splash_title)
    val desc = itemView.findViewById<MaterialTextView>(R.id.splash_desc)
    val lottie = itemView.findViewById<LottieAnimationView>(R.id.lottie)

    fun setData(item: Splash) {
        title.text = item.title
        desc.text = item.description
        lottie.setAnimation(item.lottie)
    }
}