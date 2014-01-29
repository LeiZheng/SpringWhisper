package com.xosdigital.tcx.domain;

// Generated Jan 9, 2014 5:19:54 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * SportTypes generated by hbm2java
 */
@Entity
//@Table(name = "SportTypes")
public class SportTypes implements java.io.Serializable {

    private short sportTypeId;
    private String sportName;
    private String abbreviation;
    private boolean sportTypeIsActive;
    private Set leagueses = new HashSet(0);
    private Set assetses = new HashSet(0);
    private Set sportTeamGroupses = new HashSet(0);

    public SportTypes() {
    }

    public SportTypes(short sportTypeId, String sportName, boolean sportTypeIsActive) {
        this.sportTypeId = sportTypeId;
        this.sportName = sportName;
        this.sportTypeIsActive = sportTypeIsActive;
    }

    public SportTypes(short sportTypeId, String sportName, String abbreviation, boolean sportTypeIsActive,
            Set leagueses, Set assetses, Set sportTeamGroupses) {
        this.sportTypeId = sportTypeId;
        this.sportName = sportName;
        this.abbreviation = abbreviation;
        this.sportTypeIsActive = sportTypeIsActive;
        this.leagueses = leagueses;
        this.assetses = assetses;
        this.sportTeamGroupses = sportTeamGroupses;
    }

    public short getSportTypeId() {
        return this.sportTypeId;
    }

    public void setSportTypeId(short sportTypeId) {
        this.sportTypeId = sportTypeId;
    }

    public String getSportName() {
        return this.sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public boolean isSportTypeIsActive() {
        return this.sportTypeIsActive;
    }

    public void setSportTypeIsActive(boolean sportTypeIsActive) {
        this.sportTypeIsActive = sportTypeIsActive;
    }

    public Set getLeagueses() {
        return this.leagueses;
    }

    public void setLeagueses(Set leagueses) {
        this.leagueses = leagueses;
    }

    public Set getAssetses() {
        return this.assetses;
    }

    public void setAssetses(Set assetses) {
        this.assetses = assetses;
    }

    public Set getSportTeamGroupses() {
        return this.sportTeamGroupses;
    }

    public void setSportTeamGroupses(Set sportTeamGroupses) {
        this.sportTeamGroupses = sportTeamGroupses;
    }

}
