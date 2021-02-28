package com.zhang.product.model;

/**
 * 相册表
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
public class Album {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String coverPic;

    /**
     * 
     */
    private Integer picCount;

    /**
     * 
     */
    private Integer sort;

    /**
     * 
     */
    private String description;

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
     * 获取
     */
    public String getCoverPic() {
        return coverPic;
    }

    /**
     * 设置
     */
    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    /**
     * 获取
     */
    public Integer getPicCount() {
        return picCount;
    }

    /**
     * 设置
     */
    public void setPicCount(Integer picCount) {
        this.picCount = picCount;
    }

    /**
     * 获取
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置
     */
    public void setDescription(String description) {
        this.description = description;
    }
}