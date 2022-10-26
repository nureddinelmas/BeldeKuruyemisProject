package com.nureddinelmas.belde_kuruyemis_project.ui.product.model

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.nureddinelmas.belde_kuruyemis_project.R
import com.nureddinelmas.belde_kuruyemis_project.databinding.ItemProductRecyclerviewBinding
import com.nureddinelmas.belde_kuruyemis_project.ui.product.ProductFragmentDirections
import kotlinx.android.synthetic.main.fragment_product.view.*
import kotlinx.android.synthetic.main.fragment_products_detail.view.*
import kotlinx.android.synthetic.main.item_product_recyclerview.view.*


class ProductAdapter(var productList: ArrayList<Products>): RecyclerView.Adapter<ProductAdapter.MyHolder>(), ProductClickListener {


class MyHolder(var binding: ItemProductRecyclerviewBinding): RecyclerView.ViewHolder(binding.root)
// class MyHolder(itemView : View ) : RecyclerView.ViewHolder(itemView)

	
	override fun getItemCount(): Int = productList.size
	
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
/*
	val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product_recyclerview, parent, false)
	return MyHolder(view)
	
	
 */
		val inflater = LayoutInflater.from(parent.context)
		val binding = DataBindingUtil.inflate<ItemProductRecyclerviewBinding>(inflater, R.layout.item_product_recyclerview, parent,false)
	
	// val binding : ItemProductRecyclerviewBinding = ItemProductRecyclerviewBinding.inflate(LayoutInflater.from(parent.context),parent, false)
	return MyHolder(binding)
	
	
}

override fun onBindViewHolder(holder: MyHolder, position: Int) {
	
	/*
	holder.binding.recyclerEmailText.text= productList[position].name
	 Glide.with(holder.itemView.context).load(productList[position].image).into(holder.binding.recyclerImageView)
		holder.binding.listener

	holder.itemView.setOnClickListener {
        val action = ProductFragmentDirections.actionProductFragmentToProductsDetailFragment(productList[position])
		Navigation.findNavController(holder.itemView).navigate(action)
	}
	
	 */
    holder.binding.products = productList[position]
/*	holder.binding.recyclerLayout.setOnClickListener {
	Navigation.findNavController(holder.itemView).navigate(ProductFragmentDirections.actionProductFragmentToProductsDetailFragment(productList[position]))
		//	Navigation.findNavController(holder.).navigate(ProductFragmentDirections.actionProductFragmentToProductsDetailFragment(productList[position]))
		Log.e("!!!", productList.toString())
	}
	
	
 */
	holder.binding.listener = this

}
	
	override fun onProductClicked(v: View) {
	
	val id = v.recyclerItemIdText.text.toString().toInt()
		
	 Navigation.findNavController(v).navigate(ProductFragmentDirections.actionProductFragmentToProductsDetailFragment(id))

	}
	
	
	@SuppressLint("NotifyDataSetChanged")
	fun setData(products: List<Products>){
		productList.clear()
		productList.addAll(products)
		notifyDataSetChanged()
	}
	
	
}