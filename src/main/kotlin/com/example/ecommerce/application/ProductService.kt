package com.example.ecommerce.application

import com.example.ecommerce.domain.model.Product
import com.example.ecommerce.domain.repository.ProductRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class ProductService (
    private val productRepository: ProductRepository
){
    @Transactional
    fun createProduct(product: Product): Long {
        val savedProduct = productRepository.save(product)
        return savedProduct.id
            ?: throw IllegalStateException("상품 저장 후 ID가 null입니다.")
    }
}