package com.example.ecommerce.presentation.dto

import com.example.ecommerce.domain.model.Product
import com.example.ecommerce.domain.model.ProductStatus

data class CreateProductRequest(
    val name: String,
    val slug: String,
    val shortDescription: String,
    val fullDescription: String,
    val sellerId: Long,
    val brandId: Long,
    val status: ProductStatus
) {
    fun toDomain(): Product = Product(
        name = name,
        slug = slug,
        shortDescription = shortDescription,
        fullDescription = fullDescription,
        sellerId = sellerId,
        brandId = brandId,
        status = status
    )
}
