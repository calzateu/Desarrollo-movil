package com.mintic22.celecta.network

import com.google.firebase.firestore.FirebaseFirestore
import com.mintic22.celecta.model.Products

const val PRODUCTS_COLLECTION_NAME = "products"

class FirestoreService {
    val firebaseFirestore = FirebaseFirestore.getInstance()

    fun getProducts(callback: Callback<List<Products>>){
        firebaseFirestore.collection(PRODUCTS_COLLECTION_NAME)
            .get()
            .addOnSuccessListener { result ->
                for(doc in result){
                    val list = result.toObjects(Products::class.java)
                    callback.onSuccess(list)
                    break
                }
            }
    }
}