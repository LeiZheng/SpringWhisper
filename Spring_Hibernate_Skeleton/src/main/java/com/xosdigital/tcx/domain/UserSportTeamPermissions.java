package com.xosdigital.tcx.domain;

// Generated Jan 9, 2014 5:19:54 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;


/**
 * UserSportTeamPermissions generated by hbm2java
 */
@Entity

public class UserSportTeamPermissions implements java.io.Serializable {

    private short userSportTeamPermissionId;
    private String userSportTeamPermissionName;
    private boolean userSportTeamPermissionIsActive;
    private Set usersSportTeamses = new HashSet(0);

    public UserSportTeamPermissions() {
    }

    public UserSportTeamPermissions(short userSportTeamPermissionId, String userSportTeamPermissionName,
            boolean userSportTeamPermissionIsActive) {
        this.userSportTeamPermissionId = userSportTeamPermissionId;
        this.userSportTeamPermissionName = userSportTeamPermissionName;
        this.userSportTeamPermissionIsActive = userSportTeamPermissionIsActive;
    }

    public UserSportTeamPermissions(short userSportTeamPermissionId, String userSportTeamPermissionName,
            boolean userSportTeamPermissionIsActive, Set usersSportTeamses) {
        this.userSportTeamPermissionId = userSportTeamPermissionId;
        this.userSportTeamPermissionName = userSportTeamPermissionName;
        this.userSportTeamPermissionIsActive = userSportTeamPermissionIsActive;
        this.usersSportTeamses = usersSportTeamses;
    }

    public short getUserSportTeamPermissionId() {
        return this.userSportTeamPermissionId;
    }

    public void setUserSportTeamPermissionId(short userSportTeamPermissionId) {
        this.userSportTeamPermissionId = userSportTeamPermissionId;
    }

    public String getUserSportTeamPermissionName() {
        return this.userSportTeamPermissionName;
    }

    public void setUserSportTeamPermissionName(String userSportTeamPermissionName) {
        this.userSportTeamPermissionName = userSportTeamPermissionName;
    }

    public boolean isUserSportTeamPermissionIsActive() {
        return this.userSportTeamPermissionIsActive;
    }

    public void setUserSportTeamPermissionIsActive(boolean userSportTeamPermissionIsActive) {
        this.userSportTeamPermissionIsActive = userSportTeamPermissionIsActive;
    }

    public Set getUsersSportTeamses() {
        return this.usersSportTeamses;
    }

    public void setUsersSportTeamses(Set usersSportTeamses) {
        this.usersSportTeamses = usersSportTeamses;
    }

}
