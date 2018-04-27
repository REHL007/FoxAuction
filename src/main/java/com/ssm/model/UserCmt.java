package com.ssm.model;

public class UserCmt {
    private Integer cmtid;

    private String goodsname;

    private String goodscmt;

    private String userid;

    public Integer getCmtid() {
        return cmtid;
    }

    public void setCmtid(Integer cmtid) {
        this.cmtid = cmtid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodscmt() {
        return goodscmt;
    }

    public void setGoodscmt(String goodscmt) {
        this.goodscmt = goodscmt == null ? null : goodscmt.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}