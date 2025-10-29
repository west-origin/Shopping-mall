package com.shopping.mall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class SearchController {
    @GetMapping("/search")
    public String searchItem(){
        System.out.println("실행함!");
        return "shop";
    }
}
