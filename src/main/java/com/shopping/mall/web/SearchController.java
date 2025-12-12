package com.shopping.mall.web;

import com.shopping.mall.domain.Product;
import com.shopping.mall.service.SearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;


import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // React와 통신 허용
public class SearchController {
    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/search")
    public ResponseEntity<Map<String, Object>> getProducts(
            @RequestParam("keyword") String keyword,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "9") int size) {

        // 1. 검색 + 페이지 요청
        Page<Product> productPage = searchService.searchProducts(keyword, PageRequest.of(page, size));

        // 2. response Map 구성
        Map<String, Object> response = new HashMap<>();
        response.put("products", productPage.getContent()); // 현재 페이지 데이터
        response.put("currentPage", productPage.getNumber() + 1); // 1부터 시작
        response.put("totalPages", productPage.getTotalPages());
        response.put("totalItems", productPage.getTotalElements());

        // 3. ResponseEntity 반환
        return ResponseEntity.ok(response);
    }
}

