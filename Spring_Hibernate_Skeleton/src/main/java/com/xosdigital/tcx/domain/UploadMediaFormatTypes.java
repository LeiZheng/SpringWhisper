package com.xosdigital.tcx.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

// Generated Jan 9, 2014 5:19:54 PM by Hibernate Tools 4.0.0

/**
 * UploadMediaFormatTypes generated by hbm2java
 */
@Entity
//@Table(name = "UploadMediaFormatTypes")

public class UploadMediaFormatTypes implements java.io.Serializable {

    private short uploadMediaFormatTypeId;
    private String uploadMediaFormatName;
    private String uploadMediaFormatExtension;
    private boolean uploadMediaFormatIsActive;

    public UploadMediaFormatTypes() {
    }

    public UploadMediaFormatTypes(short uploadMediaFormatTypeId, String uploadMediaFormatName,
            String uploadMediaFormatExtension, boolean uploadMediaFormatIsActive) {
        this.uploadMediaFormatTypeId = uploadMediaFormatTypeId;
        this.uploadMediaFormatName = uploadMediaFormatName;
        this.uploadMediaFormatExtension = uploadMediaFormatExtension;
        this.uploadMediaFormatIsActive = uploadMediaFormatIsActive;
    }

    public short getUploadMediaFormatTypeId() {
        return this.uploadMediaFormatTypeId;
    }

    public void setUploadMediaFormatTypeId(short uploadMediaFormatTypeId) {
        this.uploadMediaFormatTypeId = uploadMediaFormatTypeId;
    }

    public String getUploadMediaFormatName() {
        return this.uploadMediaFormatName;
    }

    public void setUploadMediaFormatName(String uploadMediaFormatName) {
        this.uploadMediaFormatName = uploadMediaFormatName;
    }

    public String getUploadMediaFormatExtension() {
        return this.uploadMediaFormatExtension;
    }

    public void setUploadMediaFormatExtension(String uploadMediaFormatExtension) {
        this.uploadMediaFormatExtension = uploadMediaFormatExtension;
    }

    public boolean isUploadMediaFormatIsActive() {
        return this.uploadMediaFormatIsActive;
    }

    public void setUploadMediaFormatIsActive(boolean uploadMediaFormatIsActive) {
        this.uploadMediaFormatIsActive = uploadMediaFormatIsActive;
    }

}
