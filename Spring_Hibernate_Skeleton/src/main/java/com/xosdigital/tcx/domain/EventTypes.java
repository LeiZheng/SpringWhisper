package com.xosdigital.tcx.domain;

// Generated Jan 9, 2014 5:19:54 PM by Hibernate Tools 4.0.0

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EventTypes generated by hbm2java
 */
@Entity
//@Table(name = "EventTypes")

public class EventTypes implements java.io.Serializable {

    private short eventTypeId;
    private String eventTypeName;
    private Date eventTypeCreatedDate;
    private boolean eventTypeIsActive;

    public EventTypes() {
    }

    public EventTypes(short eventTypeId, String eventTypeName, Date eventTypeCreatedDate, boolean eventTypeIsActive) {
        this.eventTypeId = eventTypeId;
        this.eventTypeName = eventTypeName;
        this.eventTypeCreatedDate = eventTypeCreatedDate;
        this.eventTypeIsActive = eventTypeIsActive;
    }

    public short getEventTypeId() {
        return this.eventTypeId;
    }

    public void setEventTypeId(short eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public Date getEventTypeCreatedDate() {
        return this.eventTypeCreatedDate;
    }

    public void setEventTypeCreatedDate(Date eventTypeCreatedDate) {
        this.eventTypeCreatedDate = eventTypeCreatedDate;
    }

    public boolean isEventTypeIsActive() {
        return this.eventTypeIsActive;
    }

    public void setEventTypeIsActive(boolean eventTypeIsActive) {
        this.eventTypeIsActive = eventTypeIsActive;
    }

}
