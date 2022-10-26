package com.nureddinelmas.belde_kuruyemis_project.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


fun ImageView.downloadFromUrl(url: String?){
	
	Glide.with(context)
		.load(url)
		.into(this)
}
		
		@BindingAdapter("android:downloadUrl")
		fun downloadImage(view: ImageView, url:String?){
			view.downloadFromUrl(url)
		}