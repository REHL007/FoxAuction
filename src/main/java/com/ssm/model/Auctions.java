package com.ssm.model;

import java.util.Date;

public class Auctions {
    private Integer aucid;

    private Boolean isend;

    private Integer clsid;

    private String ownerid;

    private String aucname;

    private String aucdetail;

    private String imageurl;

    private Date starttime;

    private Date closetime;

    private Float auctype;

    private Float increment;

    private Float currentprice;

    private String currentbidder;

    private String oldnew;

    private String invoice;

    private String repaired;

    private String paymode;

    private String carriage;

    private String bidtimes;

    private String clicktimes;

    public Integer getAucid() {
        return aucid;
    }

    public void setAucid(Integer aucid) {
        this.aucid = aucid;
    }

    public Boolean getIsend() {
        return isend;
    }

    public void setIsend(Boolean isend) {
        this.isend = isend;
    }

    public Integer getClsid() {
        return clsid;
    }

    public void setClsid(Integer clsid) {
        this.clsid = clsid;
    }

    public String getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(String ownerid) {
        this.ownerid = ownerid == null ? null : ownerid.trim();
    }

    public String getAucname() {
        return aucname;
    }

    public void setAucname(String aucname) {
        this.aucname = aucname == null ? null : aucname.trim();
    }

    public String getAucdetail() {
        return aucdetail;
    }

    public void setAucdetail(String aucdetail) {
        this.aucdetail = aucdetail == null ? null : aucdetail.trim();
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getClosetime() {
        return closetime;
    }

    public void setClosetime(Date closetime) {
        this.closetime = closetime;
    }

    public Float getAuctype() {
        return auctype;
    }

    public void setAuctype(Float auctype) {
        this.auctype = auctype;
    }

    public Float getIncrement() {
        return increment;
    }

    public void setIncrement(Float increment) {
        this.increment = increment;
    }

    public Float getCurrentprice() {
        return currentprice;
    }

    public void setCurrentprice(Float currentprice) {
        this.currentprice = currentprice;
    }

    public String getCurrentbidder() {
        return currentbidder;
    }

    public void setCurrentbidder(String currentbidder) {
        this.currentbidder = currentbidder == null ? null : currentbidder.trim();
    }

    public String getOldnew() {
        return oldnew;
    }

    public void setOldnew(String oldnew) {
        this.oldnew = oldnew == null ? null : oldnew.trim();
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }

    public String getRepaired() {
        return repaired;
    }

    public void setRepaired(String repaired) {
        this.repaired = repaired == null ? null : repaired.trim();
    }

    public String getPaymode() {
        return paymode;
    }

    public void setPaymode(String paymode) {
        this.paymode = paymode == null ? null : paymode.trim();
    }

    public String getCarriage() {
        return carriage;
    }

    public void setCarriage(String carriage) {
        this.carriage = carriage == null ? null : carriage.trim();
    }

    public String getBidtimes() {
        return bidtimes;
    }

    public void setBidtimes(String bidtimes) {
        this.bidtimes = bidtimes == null ? null : bidtimes.trim();
    }

    public String getClicktimes() {
        return clicktimes;
    }

    public void setClicktimes(String clicktimes) {
        this.clicktimes = clicktimes == null ? null : clicktimes.trim();
    }
}