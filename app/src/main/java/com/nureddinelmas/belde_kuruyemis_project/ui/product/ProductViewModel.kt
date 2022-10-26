package com.nureddinelmas.belde_kuruyemis_project.ui.product

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nureddinelmas.belde_kuruyemis_project.ui.product.model.Products
import com.nureddinelmas.belde_kuruyemis_project.ui.product.model.productList

class ProductViewModel : ViewModel() {
	
	private var products = MutableLiveData<ArrayList<Products>>()
	private val _text = MutableLiveData<String>().apply {
		value = "This is Product Fragment"
	}
	
	
	
}