package com.localhost.model.po;

public class drugsdetailed {
    private Integer id;

    private Integer drugstempid;

    private Integer drugsid;

    private String drugsusage;

    private String dosage;

    private String frequency;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDrugstempid() {
        return drugstempid;
    }

    public void setDrugstempid(Integer drugstempid) {
        this.drugstempid = drugstempid;
    }

    public Integer getDrugsid() {
        return drugsid;
    }

    public void setDrugsid(Integer drugsid) {
        this.drugsid = drugsid;
    }

    public String getDrugsusage() {
        return drugsusage;
    }

    public void setDrugsusage(String drugsusage) {
        this.drugsusage = drugsusage == null ? null : drugsusage.trim();
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage == null ? null : dosage.trim();
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }
}