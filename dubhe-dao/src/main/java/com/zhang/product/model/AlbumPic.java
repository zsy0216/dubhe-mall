package com.zhang.product.model;

/**
 * 画册图片表
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
public class AlbumPic {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long albumId;

    /**
     * 
     */
    private String pic;

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
    public Long getAlbumId() {
        return albumId;
    }

    /**
     * 设置
     */
    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
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
}