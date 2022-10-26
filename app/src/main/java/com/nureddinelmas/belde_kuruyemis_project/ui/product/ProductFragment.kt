package com.nureddinelmas.belde_kuruyemis_project.ui.product

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.nureddinelmas.belde_kuruyemis_project.R
import com.nureddinelmas.belde_kuruyemis_project.databinding.FragmentProductBinding
import com.nureddinelmas.belde_kuruyemis_project.ui.product.model.ProductAdapter
import com.nureddinelmas.belde_kuruyemis_project.ui.product.model.productList

class ProductFragment : Fragment() {
	
	private lateinit var _binding: FragmentProductBinding
	val adapter = ProductAdapter(arrayListOf())
	
	
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		
		val productViewModel =
			ViewModelProvider(this)[ProductViewModel::class.java]
		
		_binding = FragmentProductBinding.inflate(inflater,container, false)
	
		
		return _binding.root
	}
	
	// imageList.add(SlideModel("https://www.beldekuruyemis.com.tr/yuklemeler/slayt/4.jpg", "Toptan Kavrulmuş Çekirdek"))
	
	
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		
		
		
		_binding.recyclerViewProduct.adapter = adapter
		 _binding.recyclerViewProduct.layoutManager = LinearLayoutManager(requireActivity())
		adapter.setData(productList)
	}
	
	override fun onDestroyView() {
		super.onDestroyView()
		
	}
}