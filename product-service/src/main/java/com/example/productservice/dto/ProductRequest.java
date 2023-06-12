package com.example.productservice.dto;

import com.example.productservice.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private String name;

    private String description;

    private BigDecimal price;

    public Product toProduct() {
        return Product.builder()
                .name(this.name)
                .description(this.description)
                .price(this.price)
                .build();
    }
}
