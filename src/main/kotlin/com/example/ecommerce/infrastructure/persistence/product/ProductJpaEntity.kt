package com.example.ecommerce.infrastructure.persistence.product

import com.example.ecommerce.domain.model.ProductStatus
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "product")
class ProductJpaEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    val name: String,

    val slug: String,

    @Column(name = "short_description")
    val shortDescription: String,

    @Column(name = "full_description", columnDefinition = "TEXT")
    val fullDescription: String,

    @Column(name = "seller_id")
    val sellerId: Long,

    @Column(name = "brand_id")
    val brandId: Long,

    @Enumerated(EnumType.STRING)
    val status: ProductStatus,

    @Column(name = "created_at")
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at")
    val updatedAt: LocalDateTime = LocalDateTime.now(),
)