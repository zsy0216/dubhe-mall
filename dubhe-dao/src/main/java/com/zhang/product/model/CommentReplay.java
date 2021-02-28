package com.zhang.product.model;

import java.util.Date;

/**
 * 产品评价回复表
 * @author zhangshuaiyin
 * @date 2021-02-28 13:38:50
 */
public class CommentReplay {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long commentId;

    /**
     * 
     */
    private String memberNickName;

    /**
     * 
     */
    private String memberIcon;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private Date createTime;

    /**
     * 评论人员类型；0->会员；1->管理员
     */
    private Integer type;

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
    public Long getCommentId() {
        return commentId;
    }

    /**
     * 设置
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * 获取
     */
    public String getMemberNickName() {
        return memberNickName;
    }

    /**
     * 设置
     */
    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    /**
     * 获取
     */
    public String getMemberIcon() {
        return memberIcon;
    }

    /**
     * 设置
     */
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    /**
     * 获取
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置
     */
    public void setContent(String content) {
        this.content = content;
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
     * 获取评论人员类型；0->会员；1->管理员
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置评论人员类型；0->会员；1->管理员
     */
    public void setType(Integer type) {
        this.type = type;
    }
}