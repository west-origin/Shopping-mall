package com.shopping.mall.service;

import com.shopping.mall.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SearchService {
    /**
     * 상품명으로 검색
     * @param keyword 검색 키워드
     * @return 검색된 상품 리스트
     */
     Page<Product> searchProducts(String keyword, Pageable pageable);

    /**
     * 카테고리로 검색
     * @param categoryId 카테고리 ID
     * @return 검색된 상품 리스트
     */
    List<Product> searchByCategory(Long categoryId);

    /**
     * 가격 범위로 검색
     * @param minPrice 최소 가격
     * @param maxPrice 최대 가격
     * @return 검색된 상품 리스트
     */
    List<Product> searchByPriceRange(Double minPrice, Double maxPrice);

    /**
     * 여러 조건 통합 검색
     * @param keyword 키워드
     * @param categoryId 카테고리
     * @param minPrice 최소가격
     * @param maxPrice 최대가격
     * @return 검색된 상품 리스트
     */
    List<Product> search(String keyword, Long categoryId, Double minPrice, Double maxPrice);
}
