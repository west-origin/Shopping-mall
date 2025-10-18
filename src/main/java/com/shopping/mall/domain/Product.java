package com.shopping.mall.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Long id;                // 상품 고유 번호 (PK)
    private String name;            // 상품명
    private String description;     // 상품 설명
    private int price;              // 상품 가격
    private int stock;              // 재고 수량
    private String category;        // 카테고리 (예: 의류, 식품, 전자제품 등)
    private String thumbnailUrl;    // 대표 이미지 경로
}
