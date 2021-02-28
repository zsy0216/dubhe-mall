package com.zhang.product.model;

/**
 * 产品属性分类表
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
public class ProductAttributeCategory {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 属性数量
     */
    private Integer attributeCount;

    /**
     * 参数数量
     */
    private Integer paramCount;

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
    public String getName() {
        return name;
    }

    /**
     * 设置
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取属性数量
     */
    public Integer getAttributeCount() {
        return attributeCount;
    }

    /**
     * 设置属性数量
     */
    public void setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
    }

    /**
     * 获取参数数量
     */
    public Integer getParamCount() {
        return paramCount;
    }

    /**
     * 设置参数数量
     */
    public void setParamCount(Integer paramCount) {
        this.paramCount = paramCount;
    }
}