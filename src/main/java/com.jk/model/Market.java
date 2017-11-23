package com.jk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/16.
 */
@Entity
public class Market implements Serializable{

    private static final long serialVersionUID = -8937038704736124652L;
    @Id
    @GeneratedValue
    private Long id;//单号
    @Column(nullable = false)
    private String name;//客户
    @Column
    private Date marketDate;//销售日期
    @Column(nullable = false)
    private Integer marketMoneys;//销售金额
    @Column(nullable = false)
    private Integer registStatus;//登记情况
    @Column(nullable = false)
    private Integer status;//状态
    @Column(nullable = false)
    private Integer putAmount;//预计收款金额
    @Column
    private Date putDate;//预计收款日期
    @Column
    private Date getDate;//预计发货日期
    @Column(nullable = false)
    private Integer type;//发货方式
    @Column(nullable = false)
    private String userName;//业务员
    @Column(nullable = false)
    private String remarks;//备注

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMarketDate() {
        return marketDate;
    }

    public void setMarketDate(Date marketDate) {
        this.marketDate = marketDate;
    }

    public Integer getMarketMoneys() {
        return marketMoneys;
    }

    public void setMarketMoneys(Integer marketMoneys) {
        this.marketMoneys = marketMoneys;
    }

    public Integer getRegistStatus() {
        return registStatus;
    }

    public void setRegistStatus(Integer registStatus) {
        this.registStatus = registStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPutAmount() {
        return putAmount;
    }

    public void setPutAmount(Integer putAmount) {
        this.putAmount = putAmount;
    }

    public Date getPutDate() {
        return putDate;
    }

    public void setPutDate(Date putDate) {
        this.putDate = putDate;
    }

    public Date getGetDate() {
        return getDate;
    }

    public void setGetDate(Date getDate) {
        this.getDate = getDate;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Market market = (Market) o;

        return id.equals(market.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Market{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marketDate=" + marketDate +
                ", marketMoneys=" + marketMoneys +
                ", registStatus=" + registStatus +
                ", status=" + status +
                ", putAmount=" + putAmount +
                ", putDate=" + putDate +
                ", getDate=" + getDate +
                ", type=" + type +
                ", userName='" + userName + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
