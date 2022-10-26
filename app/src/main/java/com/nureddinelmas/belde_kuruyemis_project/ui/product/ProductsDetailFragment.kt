package com.nureddinelmas.belde_kuruyemis_project.ui.product

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.nureddinelmas.belde_kuruyemis_project.R
import com.nureddinelmas.belde_kuruyemis_project.ui.product.model.Products
import com.nureddinelmas.belde_kuruyemis_project.ui.product.model.productList

class ProductsDetailFragment : Fragment() {
	private lateinit var binding : com.nureddinelmas.belde_kuruyemis_project.databinding.FragmentProductsDetailBinding
	private val arg by navArgs<ProductsDetailFragmentArgs>()
	
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		
	}
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		
		binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_products_detail, container, false)
		// binding = FragmentProductsDetailBinding.inflate(layoutInflater)
		// Inflate the layout for this fragment
		return binding.root
		
	}
	
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		
		for (item in productList){
			if(item.id == arg.id){
				binding.textName.text= item.name
				binding.textDescription.text=item.description
				Glide.with(requireActivity()).load(item.image).into(binding.imageViewProduct)
			}
		}
		
		
	}

}