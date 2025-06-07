package com.example.ecommerce.domain.repository

import com.example.ecommerce.domain.model.Product

interface ProductRepository {
    fun save(product: Product) : Product;
}