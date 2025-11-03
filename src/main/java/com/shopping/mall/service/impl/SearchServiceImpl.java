package com.shopping.mall.service.impl;

import com.shopping.mall.domain.Product;
import com.shopping.mall.mapper.SearchDao;
import com.shopping.mall.service.SearchService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    private final SearchDao searchDao;

    public SearchServiceImpl(SearchDao searchDao) {
        this.searchDao = searchDao;
    }

    @Override
    public List<Product> searchProducts(String keyword) {
        return searchDao.searchProducts(keyword);
    }

    @Override
    public List<Product> searchByCategory(Long categoryId) {
        return searchDao.findByCategoryId(categoryId);
    }

    @Override
    public List<Product> searchByPriceRange(Double minPrice, Double maxPrice) {
        return searchDao.findByPriceBetween(minPrice, maxPrice);
    }

    @Override
    public List<Product> search(String keyword, Long categoryId, Double minPrice, Double maxPrice) {
        return searchDao.findByKeywordAndCategoryAndPrice(keyword, categoryId, minPrice, maxPrice);
    }
}
