package com.nureddinelmas.belde_kuruyemis_project.ui.product

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.nureddinelmas.belde_kuruyemis_project.databinding.FragmentProductBinding

class ProductFragment : Fragment() {
	
	private var _binding: FragmentProductBinding? = null
	
	private val binding get() = _binding!!
	
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		val productViewModel =
			ViewModelProvider(this)[ProductViewModel::class.java]
		
		_binding = FragmentProductBinding.inflate(inflater, container, false)
		val root: View = binding.root
		
		val textView: TextView = binding.textDashboard
		productViewModel.text.observe(viewLifecycleOwner) {
			textView.text = it
		}
		return root
	}
	
	override fun onDestroyView() {
		super.onDestroyView()
		_binding = null
	}
}