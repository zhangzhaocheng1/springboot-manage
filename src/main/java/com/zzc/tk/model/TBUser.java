package com.zzc.tk.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user")
public class TBUser {
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    private String password;

    @Column(name = "real_name")
    private String realName;

    private String business;

    private String email;

    @Column(name = "head_picture")
    private String headPicture;

    @Column(name = "add_date")
    private Date addDate;

    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 1：正常
2：冻结
3：删除
     */
    private Integer state;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return real_name
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * @return business
     */
    public String getBusiness() {
        return business;
    }

    /**
     * @param business
     */
    public void setBusiness(String business) {
        this.business = business;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return head_picture
     */
    public String getHeadPicture() {
        return headPicture;
    }

    /**
     * @param headPicture
     */
    public void setHeadPicture(String headPicture) {
        this.headPicture = headPicture;
    }

    /**
     * @return add_date
     */
    public Date getAddDate() {
        return addDate;
    }

    /**
     * @param addDate
     */
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    /**
     * @return update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取1：正常
2：冻结
3：删除
     *
     * @return state - 1：正常
2：冻结
3：删除
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置1：正常
2：冻结
3：删除
     *
     * @param state 1：正常
2：冻结
3：删除
     */
    public void setState(Integer state) {
        this.state = state;
    }
}