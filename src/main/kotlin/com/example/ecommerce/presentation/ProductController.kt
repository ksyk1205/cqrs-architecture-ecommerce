package com.example.ecommerce.presentation

import com.example.ecommerce.application.ProductService
import com.example.ecommerce.presentation.dto.CreateProductRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/products")
class ProductController(
    private val productService: ProductService
) {
    @PostMapping
    fun createProduct(@RequestBody request: CreateProductRequest): ResponseEntity<Long> {
        val productId = productService.createProduct(request.toDomain())
        return ResponseEntity.ok(productId)
    }
}