package com.xosdigital.tcx.domain;

// Generated Jan 9, 2014 5:19:54 PM by Hibernate Tools 4.0.0

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * UserSettings generated by hbm2java
 */
@Entity

public class UserSettings implements java.io.Serializable {

    private int userSettingId;
    private Users users;
    private String settingKey;
    private String settingValue;
    private Date userSettingCreatedDate;
    private boolean userSettingIsActive;

    public UserSettings() {
    }

    public UserSettings(int userSettingId, Users users, String settingValue, Date userSettingCreatedDate,
            boolean userSettingIsActive) {
        this.userSettingId = userSettingId;
        this.users = users;
        this.settingValue = settingValue;
        this.userSettingCreatedDate = userSettingCreatedDate;
        this.userSettingIsActive = userSettingIsActive;
    }

    public UserSettings(int userSettingId, Users users, String settingKey, String settingValue,
            Date userSettingCreatedDate, boolean userSettingIsActive) {
        this.userSettingId = userSettingId;
        this.users = users;
        this.settingKey = settingKey;
        this.settingValue = settingValue;
        this.userSettingCreatedDate = userSettingCreatedDate;
        this.userSettingIsActive = userSettingIsActive;
    }

    public int getUserSettingId() {
        return this.userSettingId;
    }

    public void setUserSettingId(int userSettingId) {
        this.userSettingId = userSettingId;
    }

    public Users getUsers() {
        return this.users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getSettingKey() {
        return this.settingKey;
    }

    public void setSettingKey(String settingKey) {
        this.settingKey = settingKey;
    }

    public String getSettingValue() {
        return this.settingValue;
    }

    public void setSettingValue(String settingValue) {
        this.settingValue = settingValue;
    }

    public Date getUserSettingCreatedDate() {
        return this.userSettingCreatedDate;
    }

    public void setUserSettingCreatedDate(Date userSettingCreatedDate) {
        this.userSettingCreatedDate = userSettingCreatedDate;
    }

    public boolean isUserSettingIsActive() {
        return this.userSettingIsActive;
    }

    public void setUserSettingIsActive(boolean userSettingIsActive) {
        this.userSettingIsActive = userSettingIsActive;
    }

}
