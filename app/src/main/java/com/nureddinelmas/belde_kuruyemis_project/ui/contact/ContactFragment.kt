package com.nureddinelmas.belde_kuruyemis_project.ui.contact

import android.Manifest
import android.widget.ArrayAdapter
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.nureddinelmas.belde_kuruyemis_project.R
import com.nureddinelmas.belde_kuruyemis_project.databinding.ContactExtraLayoutBinding
import com.nureddinelmas.belde_kuruyemis_project.databinding.FragmentContactBinding
import java.net.URLEncoder

class ContactFragment : Fragment() {
	private var _binding: FragmentContactBinding? = null
	private val binding get() = _binding!!
	
	private lateinit var extraBinding: ContactExtraLayoutBinding
	val list = arrayOf(
		
		"Sipariş Ver",
		"Şikayet Bildir",
		"Soru Sor",
		
		)
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		
		
		
		val contactViewModel = ViewModelProvider(this)[ContactViewModel::class.java]
		
		_binding = FragmentContactBinding.inflate(inflater, container, false)
		
		extraBinding = ContactExtraLayoutBinding.inflate(inflater)
		
		extraBinding.textKonum.setOnClickListener {
			val intent = Intent(Intent.ACTION_VIEW)
			intent.data = Uri.parse("https://www.google.com/maps/place/Belde+Kuruyemi%C5%9F/@41.0499085,28.8215845,17z/data=!3m1!4b1!4m5!3m4!1s0x14cab0668233ef7d:0x59bac30dbde2a4fb!8m2!3d41.0498997!4d28.823808")
				startActivity(intent)
		}
		
		val root: View = binding.root
		
		val myAdapter :ArrayAdapter<String> = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1,list )
		
		binding.spinner.adapter = myAdapter
		
		var text = binding.spinner.selectedItem.toString()
		
		binding.submit.setOnClickListener {
			sendMessage2(message = binding.message.text.toString())
			mailGonder()
			binding.submit.animate().scaleXBy(1F).duration = 7000
		}
	
		val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
		mapFragment?.getMapAsync(callback)
		
		contactViewModel.text.observe(viewLifecycleOwner) {
		}
		
		return root
	}
	
	
	
	
	override fun onDestroy() {
		_binding = null
		super.onDestroy()
	}
	
	private fun sendMessage(message: String){
		
		// Creating intent with action send
		val intent = Intent(Intent.ACTION_SEND)
		
		// Setting Intent type
		intent.type = "text/plain"
		
		// Setting whatsapp package name
		intent.setPackage("com.whatsapp")
		// intent.data = Uri.parse("https://api.whatsapp.com/send?phone=+46793240828")
		
		// Give your message here
		intent.putExtra(Intent.EXTRA_TEXT, message)
		
		
		
		// Checking whether whatsapp is installed or not
		if (activity?.let { intent.resolveActivity(it.packageManager) } == null) {
			Toast.makeText(activity,
				"Please install whatsapp first.",
				Toast.LENGTH_SHORT).show()
			return
		}
		
	
		
		// Starting Whatsapp
		startActivity(intent)
	}
	
	
	
	private fun sendMessage2(message: String){
	
		val packageManager : PackageManager
		
		val i = Intent(Intent.ACTION_VIEW)
		val url = "https://api.whatsapp.com/send?phone=+46793240828"+"&text="+URLEncoder.encode("Kimden : "+ binding.nameText.text.toString() + " \n "+ "Mesaj : "+binding.message.text.toString())
		i.setPackage("com.whatsapp")
		i.data = Uri.parse(url)
		if (activity?.let { i.resolveActivity(it.packageManager) } != null){
			startActivity(i)
		} else
		{
			Toast.makeText(activity, "Lutfen whatsapp yukleyin.", Toast.LENGTH_LONG).show()
		}
		
		
	}
	
	private fun mailGonder(){
		var mailintent = Intent(Intent.ACTION_SEND)
		
		mailintent.setType("message/rfc822")
		mailintent.putExtra(Intent.EXTRA_EMAIL, "nureddin656.elmas@gmail.com")
		mailintent.putExtra(Intent.EXTRA_SUBJECT, "Ne haber?")
		mailintent.putExtra(Intent.EXTRA_TEXT, "sadece deneme")
		startActivity(mailintent)
	}
	
	private val callback = OnMapReadyCallback { googleMap ->
		val belde = LatLng(41.05004, 28.82381)
		googleMap.addMarker(MarkerOptions().position(belde).title("Belde Kuruyemisleri"))
		googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(belde, 12f))
		
		googleMap.uiSettings.isZoomControlsEnabled= true
		
	
		
	}
}
