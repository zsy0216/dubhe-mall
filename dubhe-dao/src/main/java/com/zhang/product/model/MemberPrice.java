package com.zhang.product.model;

import java.math.BigDecimal;

/**
 * 商品会员价格表
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
public class MemberPrice {
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
    private Long memberLevelId;

    /**
     * 会员价格
     */
    private BigDecimal memberPrice;

    /**
     * 
     */
    private String memberLevelName;

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
    public Long getMemberLevelId() {
        return memberLevelId;
    }

    /**
     * 设置
     */
    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    /**
     * 获取会员价格
     */
    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    /**
     * 设置会员价格
     */
    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    /**
     * 获取
     */
    public String getMemberLevelName() {
        return memberLevelName;
    }

    /**
     * 设置
     */
    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName;
    }
}