package com.xosdigital.tcx.domain;

// Generated Jan 9, 2014 5:19:54 PM by Hibernate Tools 4.0.0

import java.util.Date;

import javax.persistence.Entity;


/**
 * AssetSportTeamOwnershipLog generated by hbm2java
 */
@Entity
public class AssetSportTeamOwnershipLog implements java.io.Serializable {

    private int id;
    private Assets assets;
    private SportTeams sportTeams;
    private Date ownershipStartDate;
    private Date ownershipEndDate;
    private int sharedByUserId;
    private Integer endedByUserId;

    public AssetSportTeamOwnershipLog() {
    }

    public AssetSportTeamOwnershipLog(int id, Assets assets, SportTeams sportTeams, Date ownershipStartDate,
            int sharedByUserId) {
        this.id = id;
        this.assets = assets;
        this.sportTeams = sportTeams;
        this.ownershipStartDate = ownershipStartDate;
        this.sharedByUserId = sharedByUserId;
    }

    public AssetSportTeamOwnershipLog(int id, Assets assets, SportTeams sportTeams, Date ownershipStartDate,
            Date ownershipEndDate, int sharedByUserId, Integer endedByUserId) {
        this.id = id;
        this.assets = assets;
        this.sportTeams = sportTeams;
        this.ownershipStartDate = ownershipStartDate;
        this.ownershipEndDate = ownershipEndDate;
        this.sharedByUserId = sharedByUserId;
        this.endedByUserId = endedByUserId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Assets getAssets() {
        return this.assets;
    }

    public void setAssets(Assets assets) {
        this.assets = assets;
    }

    public SportTeams getSportTeams() {
        return this.sportTeams;
    }

    public void setSportTeams(SportTeams sportTeams) {
        this.sportTeams = sportTeams;
    }

    public Date getOwnershipStartDate() {
        return this.ownershipStartDate;
    }

    public void setOwnershipStartDate(Date ownershipStartDate) {
        this.ownershipStartDate = ownershipStartDate;
    }

    public Date getOwnershipEndDate() {
        return this.ownershipEndDate;
    }

    public void setOwnershipEndDate(Date ownershipEndDate) {
        this.ownershipEndDate = ownershipEndDate;
    }

    public int getSharedByUserId() {
        return this.sharedByUserId;
    }

    public void setSharedByUserId(int sharedByUserId) {
        this.sharedByUserId = sharedByUserId;
    }

    public Integer getEndedByUserId() {
        return this.endedByUserId;
    }

    public void setEndedByUserId(Integer endedByUserId) {
        this.endedByUserId = endedByUserId;
    }

}