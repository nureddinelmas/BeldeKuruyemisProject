package com.nureddinelmas.belde_kuruyemis_project.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {
	
	private val _text = MutableLiveData<String>().apply {
		value = "Bu Hakkimizda sayfasi"
	}
	val text: LiveData<String> = _text
}