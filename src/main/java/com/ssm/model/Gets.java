package com.ssm.model;

import java.util.Date;

public class Gets {
    private Integer getid;

    private Integer getaucid;

    private String getauctype;

    private Float getprice;

    private Date gettime;

    private String sellerid;

    private String bidderid;

    public Integer getGetid() {
        return getid;
    }

    public void setGetid(Integer getid) {
        this.getid = getid;
    }

    public Integer getGetaucid() {
        return getaucid;
    }

    public void setGetaucid(Integer getaucid) {
        this.getaucid = getaucid;
    }

    public String getGetauctype() {
        return getauctype;
    }

    public void setGetauctype(String getauctype) {
        this.getauctype = getauctype == null ? null : getauctype.trim();
    }

    public Float getGetprice() {
        return getprice;
    }

    public void setGetprice(Float getprice) {
        this.getprice = getprice;
    }

    public Date getGettime() {
        return gettime;
    }

    public void setGettime(Date gettime) {
        this.gettime = gettime;
    }

    public String getSellerid() {
        return sellerid;
    }

    public void setSellerid(String sellerid) {
        this.sellerid = sellerid == null ? null : sellerid.trim();
    }

    public String getBidderid() {
        return bidderid;
    }

    public void setBidderid(String bidderid) {
        this.bidderid = bidderid == null ? null : bidderid.trim();
    }
}