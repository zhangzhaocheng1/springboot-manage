package com.zzc.tk.model;

import javax.persistence.*;

@Table(name = "kuaidi100_delivery")
public class TBDelivery {
    private Integer id;

    @Column(name = "delivery_name")
    private String deliveryName;

    @Column(name = "delivery_code")
    private String deliveryCode;

    @Column(name = "delivery_sort")
    private String deliverySort;

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
     * @return delivery_name
     */
    public String getDeliveryName() {
        return deliveryName;
    }

    /**
     * @param deliveryName
     */
    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    /**
     * @return delivery_code
     */
    public String getDeliveryCode() {
        return deliveryCode;
    }

    /**
     * @param deliveryCode
     */
    public void setDeliveryCode(String deliveryCode) {
        this.deliveryCode = deliveryCode;
    }

    /**
     * @return delivery_sort
     */
    public String getDeliverySort() {
        return deliverySort;
    }

    /**
     * @param deliverySort
     */
    public void setDeliverySort(String deliverySort) {
        this.deliverySort = deliverySort;
    }
}