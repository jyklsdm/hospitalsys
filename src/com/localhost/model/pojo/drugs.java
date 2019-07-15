package com.localhost.model.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class drugs {
    private Integer id;

    private String drugscode;

    private String drugsname;

    private String drugsformat;

    private String drugsunit;

    private String manufacturer;

    private Integer drugsdosageid;

    private Integer drugstypeid;

    private BigDecimal drugsprice;

    private String mnemoniccode;

    private Date creationdate;

    private Date lastupdatedate;

    private Integer delmark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrugscode() {
        return drugscode;
    }

    public void setDrugscode(String drugscode) {
        this.drugscode = drugscode == null ? null : drugscode.trim();
    }

    public String getDrugsname() {
        return drugsname;
    }

    public void setDrugsname(String drugsname) {
        this.drugsname = drugsname == null ? null : drugsname.trim();
    }

    public String getDrugsformat() {
        return drugsformat;
    }

    public void setDrugsformat(String drugsformat) {
        this.drugsformat = drugsformat == null ? null : drugsformat.trim();
    }

    public String getDrugsunit() {
        return drugsunit;
    }

    public void setDrugsunit(String drugsunit) {
        this.drugsunit = drugsunit == null ? null : drugsunit.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public Integer getDrugsdosageid() {
        return drugsdosageid;
    }

    public void setDrugsdosageid(Integer drugsdosageid) {
        this.drugsdosageid = drugsdosageid;
    }

    public Integer getDrugstypeid() {
        return drugstypeid;
    }

    public void setDrugstypeid(Integer drugstypeid) {
        this.drugstypeid = drugstypeid;
    }

    public BigDecimal getDrugsprice() {
        return drugsprice;
    }

    public void setDrugsprice(BigDecimal drugsprice) {
        this.drugsprice = drugsprice;
    }

    public String getMnemoniccode() {
        return mnemoniccode;
    }

    public void setMnemoniccode(String mnemoniccode) {
        this.mnemoniccode = mnemoniccode == null ? null : mnemoniccode.trim();
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Date getLastupdatedate() {
        return lastupdatedate;
    }

    public void setLastupdatedate(Date lastupdatedate) {
        this.lastupdatedate = lastupdatedate;
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}