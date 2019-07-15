package com.localhost.model.po;

public class disease {
    private Integer id;

    private String diseasecode;

    private String diseasename;

    private String diseaseicd;

    private Integer disecategoryid;

    private Integer delmark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiseasecode() {
        return diseasecode;
    }

    public void setDiseasecode(String diseasecode) {
        this.diseasecode = diseasecode == null ? null : diseasecode.trim();
    }

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename == null ? null : diseasename.trim();
    }

    public String getDiseaseicd() {
        return diseaseicd;
    }

    public void setDiseaseicd(String diseaseicd) {
        this.diseaseicd = diseaseicd == null ? null : diseaseicd.trim();
    }

    public Integer getDisecategoryid() {
        return disecategoryid;
    }

    public void setDisecategoryid(Integer disecategoryid) {
        this.disecategoryid = disecategoryid;
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}