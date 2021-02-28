package com.zhang.product.model;

import lombok.Data;

import java.util.Date;

/**
 * 商品评价表
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
@Data
public class Comment {
    private Long id;

    private Long productId;

    private String memberNickName;

    private String productName;

    private Integer star;

    private String memberIp;

    private Date createTime;

    private Integer showStatus;

    /**
     * 购买时的商品属性
     */
    private String productAttribute;

    private Integer collectCouont;

    private Integer readCount;

    private String pics;

    private String memberIcon;

    private Integer replayCount;

    private String content;
}