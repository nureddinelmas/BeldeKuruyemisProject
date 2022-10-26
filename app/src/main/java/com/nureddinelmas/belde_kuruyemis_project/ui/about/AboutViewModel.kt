package com.nureddinelmas.belde_kuruyemis_project.ui.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutViewModel : ViewModel() {
	
	private val _text = MutableLiveData<String>().apply {
		value = "Bu Hakkimizda sayfasi"
	}
	val text: LiveData<String> = _text
}