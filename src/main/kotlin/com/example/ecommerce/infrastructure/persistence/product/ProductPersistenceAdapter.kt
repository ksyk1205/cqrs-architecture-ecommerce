package com.example.ecommerce.infrastructure.persistence.product

import com.example.ecommerce.domain.model.Product
import com.example.ecommerce.domain.repository.ProductRepository
import org.springframework.stereotype.Repository

@Repository
class ProductPersistenceAdapter (
    private val productJpaRepository: ProductJpaRepository,
    private val productMapper: ProductMapper
): ProductRepository{
    override fun save(product: Product): Product {
        val entity = productMapper.toEntity(product)
        val savedEntity = productJpaRepository.save(entity)
        return productMapper.toDomain(savedEntity)
    }
}