package com.shopping.mall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class SearchController {
    @GetMapping("/search")
    public String searchItem(@RequestBody){
        return "shop";
    }
}
