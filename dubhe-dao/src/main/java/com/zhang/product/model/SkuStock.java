package com.zhang.product.model;

import java.math.BigDecimal;

/**
 * sku的库存
 *
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
public class SkuStock {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private Long productId;

    /**
     * sku编码
     */
    private String skuCode;

    /**
     *
     */
    private BigDecimal price;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 预警库存
     */
    private Integer lowStock;

    /**
     * 销售属性1
     */
    private String sp1;

    /**
     *
     */
    private String sp2;

    /**
     *
     */
    private String sp3;

    /**
     * 展示图片
     */
    private String pic;

    /**
     * 销量
     */
    private Integer sale;

    /**
     * 单品促销价格
     */
    private BigDecimal promotionPrice;

    /**
     * 锁定库存
     */
    private Integer lockStock;

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
     * 获取sku编码
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     * 设置sku编码
     */
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    /**
     * 获取
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取预警库存
     */
    public Integer getLowStock() {
        return lowStock;
    }

    /**
     * 设置预警库存
     */
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    /**
     * 获取销售属性1
     */
    public String getSp1() {
        return sp1;
    }

    /**
     * 设置销售属性1
     */
    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }

    /**
     * 获取
     */
    public String getSp2() {
        return sp2;
    }

    /**
     * 设置
     */
    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }

    /**
     * 获取
     */
    public String getSp3() {
        return sp3;
    }

    /**
     * 设置
     */
    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }

    /**
     * 获取展示图片
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置展示图片
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 获取销量
     */
    public Integer getSale() {
        return sale;
    }

    /**
     * 设置销量
     */
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    /**
     * 获取单品促销价格
     */
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * 设置单品促销价格
     */
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * 获取锁定库存
     */
    public Integer getLockStock() {
        return lockStock;
    }

    /**
     * 设置锁定库存
     */
    public void setLockStock(Integer lockStock) {
        this.lockStock = lockStock;
    }
}