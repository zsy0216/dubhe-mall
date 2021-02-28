package com.zhang.product.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品信息
 *
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
@Data
public class Product {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private Long brandId;

    /**
     *
     */
    private Long productCategoryId;

    /**
     *
     */
    private Long feightTemplateId;

    /**
     *
     */
    private Long productAttributeCategoryId;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String pic;

    /**
     * 货号
     */
    private String productSn;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    private Integer deleteStatus;

    /**
     * 上架状态：0->下架；1->上架
     */
    private Integer publishStatus;

    /**
     * 新品状态:0->不是新品；1->新品
     */
    private Integer newStatus;

    /**
     * 推荐状态；0->不推荐；1->推荐
     */
    private Integer recommandStatus;

    /**
     * 审核状态：0->未审核；1->审核通过
     */
    private Integer verifyStatus;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 销量
     */
    private Integer sale;

    /**
     *
     */
    private BigDecimal price;

    /**
     * 促销价格
     */
    private BigDecimal promotionPrice;

    /**
     * 赠送的成长值
     */
    private Integer giftGrowth;

    /**
     * 赠送的积分
     */
    private Integer giftPoint;

    /**
     * 限制使用的积分数
     */
    private Integer usePointLimit;

    /**
     * 副标题
     */
    private String subTitle;

    /**
     * 市场价
     */
    private BigDecimal originalPrice;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 库存预警值
     */
    private Integer lowStock;

    /**
     * 单位
     */
    private String unit;

    /**
     * 商品重量，默认为克
     */
    private BigDecimal weight;

    /**
     * 是否为预告商品：0->不是；1->是
     */
    private Integer previewStatus;

    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    private String serviceIds;

    /**
     *
     */
    private String keywords;

    /**
     *
     */
    private String note;

    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     */
    private String albumPics;

    /**
     *
     */
    private String detailTitle;

    /**
     * 促销开始时间
     */
    private Date promotionStartTime;

    /**
     * 促销结束时间
     */
    private Date promotionEndTime;

    /**
     * 活动限购数量
     */
    private Integer promotionPerLimit;

    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    private Integer promotionType;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 商品分类名称
     */
    private String productCategoryName;

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
    public Long getBrandId() {
        return brandId;
    }

    /**
     * 设置
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * 获取
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * 设置
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * 获取
     */
    public Long getFeightTemplateId() {
        return feightTemplateId;
    }

    /**
     * 设置
     */
    public void setFeightTemplateId(Long feightTemplateId) {
        this.feightTemplateId = feightTemplateId;
    }

    /**
     * 获取
     */
    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    /**
     * 设置
     */
    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
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
    public String getPic() {
        return pic;
    }

    /**
     * 设置
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 获取货号
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * 设置货号
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    /**
     * 获取删除状态：0->未删除；1->已删除
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 设置删除状态：0->未删除；1->已删除
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * 获取上架状态：0->下架；1->上架
     */
    public Integer getPublishStatus() {
        return publishStatus;
    }

    /**
     * 设置上架状态：0->下架；1->上架
     */
    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * 获取新品状态:0->不是新品；1->新品
     */
    public Integer getNewStatus() {
        return newStatus;
    }

    /**
     * 设置新品状态:0->不是新品；1->新品
     */
    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    /**
     * 获取推荐状态；0->不推荐；1->推荐
     */
    public Integer getRecommandStatus() {
        return recommandStatus;
    }

    /**
     * 设置推荐状态；0->不推荐；1->推荐
     */
    public void setRecommandStatus(Integer recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    /**
     * 获取审核状态：0->未审核；1->审核通过
     */
    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    /**
     * 设置审核状态：0->未审核；1->审核通过
     */
    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    /**
     * 获取排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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
     * 获取促销价格
     */
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * 设置促销价格
     */
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * 获取赠送的成长值
     */
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    /**
     * 设置赠送的成长值
     */
    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    /**
     * 获取赠送的积分
     */
    public Integer getGiftPoint() {
        return giftPoint;
    }

    /**
     * 设置赠送的积分
     */
    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    /**
     * 获取限制使用的积分数
     */
    public Integer getUsePointLimit() {
        return usePointLimit;
    }

    /**
     * 设置限制使用的积分数
     */
    public void setUsePointLimit(Integer usePointLimit) {
        this.usePointLimit = usePointLimit;
    }

    /**
     * 获取副标题
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * 设置副标题
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * 获取市场价
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 设置市场价
     */
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
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
     * 获取库存预警值
     */
    public Integer getLowStock() {
        return lowStock;
    }

    /**
     * 设置库存预警值
     */
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    /**
     * 获取单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取商品重量，默认为克
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 设置商品重量，默认为克
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 获取是否为预告商品：0->不是；1->是
     */
    public Integer getPreviewStatus() {
        return previewStatus;
    }

    /**
     * 设置是否为预告商品：0->不是；1->是
     */
    public void setPreviewStatus(Integer previewStatus) {
        this.previewStatus = previewStatus;
    }

    /**
     * 获取以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    public String getServiceIds() {
        return serviceIds;
    }

    /**
     * 设置以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    public void setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds;
    }

    /**
     * 获取
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 设置
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * 获取
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 获取画册图片，连产品图片限制为5张，以逗号分割
     */
    public String getAlbumPics() {
        return albumPics;
    }

    /**
     * 设置画册图片，连产品图片限制为5张，以逗号分割
     */
    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    /**
     * 获取
     */
    public String getDetailTitle() {
        return detailTitle;
    }

    /**
     * 设置
     */
    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle;
    }

    /**
     * 获取促销开始时间
     */
    public Date getPromotionStartTime() {
        return promotionStartTime;
    }

    /**
     * 设置促销开始时间
     */
    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    /**
     * 获取促销结束时间
     */
    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    /**
     * 设置促销结束时间
     */
    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    /**
     * 获取活动限购数量
     */
    public Integer getPromotionPerLimit() {
        return promotionPerLimit;
    }

    /**
     * 设置活动限购数量
     */
    public void setPromotionPerLimit(Integer promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    /**
     * 获取促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    public Integer getPromotionType() {
        return promotionType;
    }

    /**
     * 设置促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    /**
     * 获取品牌名称
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 设置品牌名称
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * 获取商品分类名称
     */
    public String getProductCategoryName() {
        return productCategoryName;
    }

    /**
     * 设置商品分类名称
     */
    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }
}