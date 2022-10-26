package com.nureddinelmas.belde_kuruyemis_project.ui.contact

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContactViewModel : ViewModel() {
	private val _text = MutableLiveData<String>().apply {
		value = "This is Iletisim Fragment"
	}
	
	val text : LiveData<String> = _text
}


