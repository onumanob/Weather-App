package com.ashik.weatherapp.adapters

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.ashik.weatherapp.getFormattedDate
import com.ashik.weatherapp.icon_prefix
import com.ashik.weatherapp.icon_suffix
import com.bumptech.glide.Glide

@BindingAdapter("app:setWeatherIcon")
fun setIcon(imageView: ImageView, icon: String?) {
    icon?.let {
        val url = "$icon_prefix$icon$icon_suffix"
        Glide
            .with(imageView.context)
            .load(url)
            .into(imageView)
    }

}

@BindingAdapter("app:setDateTime")
fun setDateTime(textView: TextView, dt: Long) {
    textView.text = getFormattedDate(dt, "MMM dd, yyyy HH:mm")
}

@BindingAdapter("app:setWeekdayTime")
fun setWeekdayTime(textView: TextView, dt: Long) {
    textView.text = getFormattedDate(dt, "EEE, HH:mm")
}

@BindingAdapter("app:setSunrise")
fun setSunrise(textView: TextView, dt: Long){
    textView.text = getFormattedDate(dt, pattern = "hh:mm a")
}