package com.nureddinelmas.belde_kuruyemis_project

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.nureddinelmas.belde_kuruyemis_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	
	private lateinit var binding: ActivityMainBinding
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)
		
		val navView: BottomNavigationView = binding.navView
		
		val navController = findNavController(R.id.nav_host_fragment_activity_main)
	
		val appBarConfiguration = AppBarConfiguration(
			setOf(
				R.id.navigation_home, R.id.navigation_products, R.id.navigation_notifications, R.id.navigation_profile
			)
		)
		// setupActionBarWithNavController(navController, appBarConfiguration)
		navView.setupWithNavController(navController)
		
		//Custom Image for action bar start
		
		// actionBar?.setDisplayShowCustomEnabled(true)
		// LayoutInflater inflater = this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	// 	View view = inflater.inflate(R.layout.custom_logo)
	}
}