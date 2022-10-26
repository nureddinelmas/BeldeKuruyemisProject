package com.nureddinelmas.belde_kuruyemis_project.ui.home

import android.os.Bundle
import android.transition.Slide
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.nureddinelmas.belde_kuruyemis_project.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
	
	private var _binding: FragmentHomeBinding? = null
	
	// This property is only valid between onCreateView and
	// onDestroyView.
	private val binding get() = _binding!!
	var imageList = ArrayList<SlideModel>()
	
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		val homeViewModel =
			ViewModelProvider(this).get(HomeViewModel::class.java)
		
		_binding = FragmentHomeBinding.inflate(inflater, container, false)
		val root: View = binding.root
		
		imageList.add(SlideModel("https://www.beldekuruyemis.com.tr/yuklemeler/slayt/2.jpg", "Toptan Tuzsuz Fıstık"))
		imageList.add(SlideModel("https://www.beldekuruyemis.com.tr/yuklemeler/slayt/3.jpg", "Toptan Kabuklu Fıstık"))
		imageList.add(SlideModel("https://www.beldekuruyemis.com.tr/yuklemeler/slayt/4.jpg", "Toptan Kavrulmuş Çekirdek"))
		
		binding.imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP)
		
		homeViewModel.text.observe(viewLifecycleOwner) {
		
		}
		return root
	}
	
	override fun onDestroyView() {
		super.onDestroyView()
		_binding = null
	}
}

