package com.ssm.model;

public class Classes {
    private Integer clsid;

    private String clsname;

    private String upperid;

    public Integer getClsid() {
        return clsid;
    }

    public void setClsid(Integer clsid) {
        this.clsid = clsid;
    }

    public String getClsname() {
        return clsname;
    }

    public void setClsname(String clsname) {
        this.clsname = clsname == null ? null : clsname.trim();
    }

    public String getUpperid() {
        return upperid;
    }

    public void setUpperid(String upperid) {
        this.upperid = upperid == null ? null : upperid.trim();
    }
}