package com.zhang.product.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
public class ProductOperateLog {
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
    private BigDecimal priceOld;

    /**
     * 
     */
    private BigDecimal priceNew;

    /**
     * 
     */
    private BigDecimal salePriceOld;

    /**
     * 
     */
    private BigDecimal salePriceNew;

    /**
     * 赠送的积分
     */
    private Integer giftPointOld;

    /**
     * 
     */
    private Integer giftPointNew;

    /**
     * 
     */
    private Integer usePointLimitOld;

    /**
     * 
     */
    private Integer usePointLimitNew;

    /**
     * 操作人
     */
    private String operateMan;

    /**
     * 
     */
    private Date createTime;

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
    public BigDecimal getPriceOld() {
        return priceOld;
    }

    /**
     * 设置
     */
    public void setPriceOld(BigDecimal priceOld) {
        this.priceOld = priceOld;
    }

    /**
     * 获取
     */
    public BigDecimal getPriceNew() {
        return priceNew;
    }

    /**
     * 设置
     */
    public void setPriceNew(BigDecimal priceNew) {
        this.priceNew = priceNew;
    }

    /**
     * 获取
     */
    public BigDecimal getSalePriceOld() {
        return salePriceOld;
    }

    /**
     * 设置
     */
    public void setSalePriceOld(BigDecimal salePriceOld) {
        this.salePriceOld = salePriceOld;
    }

    /**
     * 获取
     */
    public BigDecimal getSalePriceNew() {
        return salePriceNew;
    }

    /**
     * 设置
     */
    public void setSalePriceNew(BigDecimal salePriceNew) {
        this.salePriceNew = salePriceNew;
    }

    /**
     * 获取赠送的积分
     */
    public Integer getGiftPointOld() {
        return giftPointOld;
    }

    /**
     * 设置赠送的积分
     */
    public void setGiftPointOld(Integer giftPointOld) {
        this.giftPointOld = giftPointOld;
    }

    /**
     * 获取
     */
    public Integer getGiftPointNew() {
        return giftPointNew;
    }

    /**
     * 设置
     */
    public void setGiftPointNew(Integer giftPointNew) {
        this.giftPointNew = giftPointNew;
    }

    /**
     * 获取
     */
    public Integer getUsePointLimitOld() {
        return usePointLimitOld;
    }

    /**
     * 设置
     */
    public void setUsePointLimitOld(Integer usePointLimitOld) {
        this.usePointLimitOld = usePointLimitOld;
    }

    /**
     * 获取
     */
    public Integer getUsePointLimitNew() {
        return usePointLimitNew;
    }

    /**
     * 设置
     */
    public void setUsePointLimitNew(Integer usePointLimitNew) {
        this.usePointLimitNew = usePointLimitNew;
    }

    /**
     * 获取操作人
     */
    public String getOperateMan() {
        return operateMan;
    }

    /**
     * 设置操作人
     */
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    /**
     * 获取
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}