// src/main/java/com/example/ecommerce/ecom_backend/dto/CartResponseDTO.java
package com.example.ecommerce.ecom_backend.cart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartResponseDTO {

    private Long id; // Cart ID
    private Long userId;
    private List<CartItemResponseDTO> items;
    private BigDecimal totalPrice; // Sum of all item subtotals in the cart
}