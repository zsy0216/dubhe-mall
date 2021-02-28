package com.zhang.product.model;

/**
 * 存储产品参数信息的表
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
public class ProductAttributeValue {
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
    private Long productAttributeId;

    /**
     * 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
     */
    private String value;

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
    public Long getProductAttributeId() {
        return productAttributeId;
    }

    /**
     * 设置
     */
    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    /**
     * 获取手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
     */
    public void setValue(String value) {
        this.value = value;
    }
}