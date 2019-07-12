package com.localhost.model.pojo;

import java.math.BigDecimal;

public class herbaldetailed {
    private Integer id;

    private Integer herbalpresid;

    private Integer herbalid;

    private String dosage;

    private BigDecimal price;

    private String footnote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHerbalpresid() {
        return herbalpresid;
    }

    public void setHerbalpresid(Integer herbalpresid) {
        this.herbalpresid = herbalpresid;
    }

    public Integer getHerbalid() {
        return herbalid;
    }

    public void setHerbalid(Integer herbalid) {
        this.herbalid = herbalid;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage == null ? null : dosage.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFootnote() {
        return footnote;
    }

    public void setFootnote(String footnote) {
        this.footnote = footnote == null ? null : footnote.trim();
    }
}