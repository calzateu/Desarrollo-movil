package com.mintic22.celecta.view.adapter

import com.mintic22.celecta.model.Products

interface ProductsListener {
    fun OnProductsClick(products: Products, position: Int)
}