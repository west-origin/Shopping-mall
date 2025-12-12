package com.shopping.mall.web;

import com.shopping.mall.domain.Product;
import com.shopping.mall.service.SearchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // React와 통신 허용
public class HomeController {

    private final SearchService searchService;

    public HomeController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/main")
    public String home(){
        return "index";
    }
}
