package com.shopping.mall.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Long prdId;         // 상품 고유 번호 (PK)
    private String prdNm;        // 상품명
    private String cntnt;        // 상품 설명
    private int prdPrc;          // 상품 정가
    private int prdSl;           // 상품 할인/판매수량
    private int stck;            // 재고 수량
    private LocalDate rdt;       // 등록일
    private String del;          // 삭제 여부 ('Y' or 'N')
    private Long ctgrId;         // 카테고리 고유번호 (FK)
    private String ctgrNm;       // 카테고리명
}
