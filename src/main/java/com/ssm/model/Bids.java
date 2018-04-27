package com.ssm.model;

import java.util.Date;

public class Bids {
    private Integer bidid;

    private Integer bidaucid;

    private String auctype;

    private Float bidprice;

    private Date bidtime;

    private String sellerid;

    private String bidderid;

    public Integer getBidid() {
        return bidid;
    }

    public void setBidid(Integer bidid) {
        this.bidid = bidid;
    }

    public Integer getBidaucid() {
        return bidaucid;
    }

    public void setBidaucid(Integer bidaucid) {
        this.bidaucid = bidaucid;
    }

    public String getAuctype() {
        return auctype;
    }

    public void setAuctype(String auctype) {
        this.auctype = auctype == null ? null : auctype.trim();
    }

    public Float getBidprice() {
        return bidprice;
    }

    public void setBidprice(Float bidprice) {
        this.bidprice = bidprice;
    }

    public Date getBidtime() {
        return bidtime;
    }

    public void setBidtime(Date bidtime) {
        this.bidtime = bidtime;
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