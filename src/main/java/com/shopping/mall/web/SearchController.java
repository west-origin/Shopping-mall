package com.shopping.mall.web;


import com.shopping.mall.domain.Product;
import com.shopping.mall.service.SearchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {

    private final SearchService searchService;

    // ✅ 생성자 주입 (스프링이 자동으로 SearchServiceImpl을 주입해줌)
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/search")
    public String searchItem(@RequestParam("keyword") String keyword, Model model) {
        List<Product> results = searchService.searchByName(keyword);
        model.addAttribute("products", results);
        return "shop";
    }
}
