package com.zhang.product.model;

import java.math.BigDecimal;

/**
 * 运费模版
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
public class FreightTemplate {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 计费类型:0->按重量；1->按件数
     */
    private Integer chargeType;

    /**
     * 首重kg
     */
    private BigDecimal firstWeight;

    /**
     * 首费（元）
     */
    private BigDecimal firstFee;

    /**
     * 
     */
    private BigDecimal continueWeight;

    /**
     * 
     */
    private BigDecimal continmeFee;

    /**
     * 目的地（省、市）
     */
    private String dest;

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
     * 获取计费类型:0->按重量；1->按件数
     */
    public Integer getChargeType() {
        return chargeType;
    }

    /**
     * 设置计费类型:0->按重量；1->按件数
     */
    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    /**
     * 获取首重kg
     */
    public BigDecimal getFirstWeight() {
        return firstWeight;
    }

    /**
     * 设置首重kg
     */
    public void setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
    }

    /**
     * 获取首费（元）
     */
    public BigDecimal getFirstFee() {
        return firstFee;
    }

    /**
     * 设置首费（元）
     */
    public void setFirstFee(BigDecimal firstFee) {
        this.firstFee = firstFee;
    }

    /**
     * 获取
     */
    public BigDecimal getContinueWeight() {
        return continueWeight;
    }

    /**
     * 设置
     */
    public void setContinueWeight(BigDecimal continueWeight) {
        this.continueWeight = continueWeight;
    }

    /**
     * 获取
     */
    public BigDecimal getContinmeFee() {
        return continmeFee;
    }

    /**
     * 设置
     */
    public void setContinmeFee(BigDecimal continmeFee) {
        this.continmeFee = continmeFee;
    }

    /**
     * 获取目的地（省、市）
     */
    public String getDest() {
        return dest;
    }

    /**
     * 设置目的地（省、市）
     */
    public void setDest(String dest) {
        this.dest = dest;
    }
}