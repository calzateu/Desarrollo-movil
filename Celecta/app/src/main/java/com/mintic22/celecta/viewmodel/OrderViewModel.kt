package com.mintic22.celecta.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mintic22.celecta.model.Products
import com.mintic22.celecta.network.Callback
import com.mintic22.celecta.network.FirestoreService
import java.lang.Exception

class OrderViewModel: ViewModel() {
    val firestoreService = FirestoreService()
    var listProducts : MutableLiveData<List<Products>> = MutableLiveData()
    var isLoading = MutableLiveData<Boolean>()

    fun refresh() {
        getProductsFromFrirebase()
    }

    fun getProductsFromFrirebase(){
        firestoreService.getProducts(object : Callback<List<Products>> {
            override fun onSuccess(result: List<Products>?) {
                listProducts.postValue(result)
                processFinished()
            }

            override fun onFailed(exception: Exception) {
                processFinished()
            }
        })
    }

    fun processFinished() {
        isLoading.value = true
    }
}