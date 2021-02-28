package com.zhang.product.model;

import java.util.Date;

/**
 * 商品审核记录
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
public class ProductVerifyRecord {
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
    private Date createTime;

    /**
     * 审核人
     */
    private String vertifyMan;

    /**
     * 
     */
    private Integer status;

    /**
     * 反馈详情
     */
    private String detail;

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
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取审核人
     */
    public String getVertifyMan() {
        return vertifyMan;
    }

    /**
     * 设置审核人
     */
    public void setVertifyMan(String vertifyMan) {
        this.vertifyMan = vertifyMan;
    }

    /**
     * 获取
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取反馈详情
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置反馈详情
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
}