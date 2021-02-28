package com.zhang.product.model;

/**
 * 品牌表
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
public class Brand {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 首字母
     */
    private String firstLetter;

    /**
     * 
     */
    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     */
    private Integer factoryStatus;

    /**
     * 
     */
    private Integer showStatus;

    /**
     * 产品数量
     */
    private Integer productCount;

    /**
     * 产品评论数量
     */
    private Integer productCommentCount;

    /**
     * 品牌logo
     */
    private String logo;

    /**
     * 专区大图
     */
    private String bigPic;

    /**
     * 品牌故事
     */
    private String brandStory;

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
     * 获取首字母
     */
    public String getFirstLetter() {
        return firstLetter;
    }

    /**
     * 设置首字母
     */
    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
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
     * 获取是否为品牌制造商：0->不是；1->是
     */
    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    /**
     * 设置是否为品牌制造商：0->不是；1->是
     */
    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    /**
     * 获取
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 设置
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * 获取产品数量
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * 设置产品数量
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * 获取产品评论数量
     */
    public Integer getProductCommentCount() {
        return productCommentCount;
    }

    /**
     * 设置产品评论数量
     */
    public void setProductCommentCount(Integer productCommentCount) {
        this.productCommentCount = productCommentCount;
    }

    /**
     * 获取品牌logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置品牌logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取专区大图
     */
    public String getBigPic() {
        return bigPic;
    }

    /**
     * 设置专区大图
     */
    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    /**
     * 获取品牌故事
     */
    public String getBrandStory() {
        return brandStory;
    }

    /**
     * 设置品牌故事
     */
    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }
}