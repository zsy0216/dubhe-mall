package com.zhang.product.model;

/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
public class ProductCategoryAttributeRelation {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long productCategoryId;

    /**
     * 
     */
    private Long productAttributeId;

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
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * 设置
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * 获取
     */
    public Long getProductAttributeId() {
        return productAttributeId;
    }

    /**
     * 设置
     */
    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }
}