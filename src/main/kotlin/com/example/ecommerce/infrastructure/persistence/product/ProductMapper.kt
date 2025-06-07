package com.example.ecommerce.infrastructure.persistence.product

import com.example.ecommerce.domain.model.Product
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ProductMapper {
    fun toEntity(domain: Product): ProductJpaEntity
    fun toDomain(entity: ProductJpaEntity): Product
}