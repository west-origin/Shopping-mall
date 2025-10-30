package com.shopping.mall.mapper;

import com.shopping.mall.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface SearchDao {

    List<Product> findByNameContaining(@Param("keyword") String keyword);

    List<Product> findByCategoryId(@Param("categoryId") Long categoryId);

    List<Product> findByPriceBetween(@Param("minPrice") Double minPrice,
                                     @Param("maxPrice") Double maxPrice);

    List<Product> findByKeywordAndCategoryAndPrice(@Param("keyword") String keyword,
                                                   @Param("categoryId") Long categoryId,
                                                   @Param("minPrice") Double minPrice,
                                                   @Param("maxPrice") Double maxPrice);
}
