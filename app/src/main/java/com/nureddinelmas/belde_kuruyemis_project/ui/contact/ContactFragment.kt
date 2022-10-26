package com.nureddinelmas.belde_kuruyemis_project.ui.contact

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.nureddinelmas.belde_kuruyemis_project.databinding.FragmentContactBinding

class ContactFragment : Fragment() {
	private var _binding: FragmentContactBinding? = null
	private val binding get() = _binding!!
	
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		val contactViewModel = ViewModelProvider(this).get(ContactViewModel::class.java)
		
		_binding = FragmentContactBinding.inflate(inflater, container, false)
		val root: View = binding.root
		
		binding.submit.setOnClickListener {
			sendMessage(message = binding.message.text.toString())
		}
	
		contactViewModel.text.observe(viewLifecycleOwner) {
		
			
			
		}
		
		return root
	}
	
	
	override fun onDestroy() {
		_binding = null
		super.onDestroy()
	}
	
	private fun sendMessage(message: String){
		Log.e("!!!", binding.message.text.toString())
		// Creating intent with action send
		val intent = Intent(Intent.ACTION_SEND)
		
		// Setting Intent type
		intent.type = "text/plain"
		
		// Setting whatsapp package name
		intent.setPackage("com.whatsapp")
		
		// Give your message here
		intent.putExtra(Intent.EXTRA_TEXT, message)
		/*
		// Checking whether whatsapp is installed or not
		if (activity?.let { intent.resolveActivity(it.packageManager) } == null) {
			Toast.makeText(activity,
				"Please install whatsapp first.",
				Toast.LENGTH_SHORT).show()
			return
		}
		
		 */
		
		// Starting Whatsapp
		startActivity(intent)
	}
	
}