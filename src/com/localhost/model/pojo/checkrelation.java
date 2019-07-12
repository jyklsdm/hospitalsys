package com.localhost.model.pojo;

public class checkrelation {
    private Integer id;

    private Integer checkprojid;

    private Integer checktempid;

    private String position;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCheckprojid() {
        return checkprojid;
    }

    public void setCheckprojid(Integer checkprojid) {
        this.checkprojid = checkprojid;
    }

    public Integer getChecktempid() {
        return checktempid;
    }

    public void setChecktempid(Integer checktempid) {
        this.checktempid = checktempid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }
}