package com.nureddinelmas.belde_kuruyemis_project.ui.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.nureddinelmas.belde_kuruyemis_project.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {
	
	private var _binding: FragmentAboutBinding? = null
	
	private val binding get() = _binding!!
	
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		val aboutViewModel =
			ViewModelProvider(this)[AboutViewModel::class.java]
		
		_binding = FragmentAboutBinding.inflate(inflater, container, false)
		val root: View = binding.root
		
		Glide.with(this).load("https://www.beldekuruyemis.com.tr/yuklemeler/sistem/hakkimizda.jpg").into(binding.imageViewAbout1)
		
		aboutViewModel.text.observe(viewLifecycleOwner) {
		
		}
		return root
	}
	
	override fun onDestroyView() {
		super.onDestroyView()
		_binding = null
	}
}