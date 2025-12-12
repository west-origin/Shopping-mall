package com.shopping.mall.mapper;

import com.shopping.mall.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;

@Mapper
public interface SearchDao {

    Page<Product> searchProducts(@Param("keyword") String keyword,
                                @Param("pageable") Pageable pageable);

    List<Product> findByCategoryId(@Param("categoryId") Long categoryId);

    List<Product> findByPriceBetween(@Param("minPrice") Double minPrice,
                                     @Param("maxPrice") Double maxPrice);

    List<Product> findByKeywordAndCategoryAndPrice(@Param("keyword") String keyword,
                                                   @Param("categoryId") Long categoryId,
                                                   @Param("minPrice") Double minPrice,
                                                   @Param("maxPrice") Double maxPrice);
}
