package com.example.ecommerce.domain.model

import java.time.LocalDateTime

data class Product(
    val id: Long? = null,
    val name: String,
    val slug: String,
    val shortDescription: String,
    val fullDescription: String,
    val sellerId: Long,
    val brandId: Long,
    val status: ProductStatus,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now(),
)
