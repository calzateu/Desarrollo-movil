package com.mintic22.celecta.view.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mintic22.celecta.view.ui.network.ImageRequester
import com.mintic22.celecta.view.ui.network.ProductEntry
import kotlinx.android.synthetic.main.shr_product_card.view.*
import com.mintic22.celecta.R
import com.squareup.picasso.Picasso

/**
 * Adapter used to show a simple grid of products.
 */
class ProductCardRecyclerViewAdapter(private val productList: List<ProductEntry>) : RecyclerView.Adapter<ProductCardViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductCardViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.shr_product_card, parent, false)
        return ProductCardViewHolder(layoutView)
    }

    override fun onBindViewHolder(holder: ProductCardViewHolder, position: Int) {
        // TODO: Put ViewHolder binding code here in MDC-102
        if(position < productList.size){
            val product = productList[position]
            holder.productTitle.text = product.title
            holder.productPrice.text = product.price
            Picasso.get().load(product.url).into(holder.ivItemProduct)
        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }
}
