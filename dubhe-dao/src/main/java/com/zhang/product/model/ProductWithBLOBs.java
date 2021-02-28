package com.zhang.product.model;

/**
 * 商品信息
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
public class ProductWithBLOBs extends Product {
    /**
     * 商品描述
     */
    private String description;

    /**
     * 
     */
    private String detailDesc;

    /**
     * 产品详情网页内容
     */
    private String detailHtml;

    /**
     * 移动端网页详情
     */
    private String detailMobileHtml;

    /**
     * 获取商品描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置商品描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取
     */
    public String getDetailDesc() {
        return detailDesc;
    }

    /**
     * 设置
     */
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    /**
     * 获取产品详情网页内容
     */
    public String getDetailHtml() {
        return detailHtml;
    }

    /**
     * 设置产品详情网页内容
     */
    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml;
    }

    /**
     * 获取移动端网页详情
     */
    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    /**
     * 设置移动端网页详情
     */
    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml;
    }
}