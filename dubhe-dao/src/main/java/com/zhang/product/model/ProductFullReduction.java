package com.zhang.product.model;

import java.math.BigDecimal;

/**
 * 产品满减表(只针对同商品)
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
public class ProductFullReduction {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long productId;

    /**
     * 
     */
    private BigDecimal fullPrice;

    /**
     * 
     */
    private BigDecimal reducePrice;

    /**
     * 获取
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取
     */
    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    /**
     * 设置
     */
    public void setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    /**
     * 获取
     */
    public BigDecimal getReducePrice() {
        return reducePrice;
    }

    /**
     * 设置
     */
    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
    }
}