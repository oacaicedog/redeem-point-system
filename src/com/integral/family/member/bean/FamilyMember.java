package com.integral.family.member.bean;

// Generated Dec 13, 2011 1:16:43 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * FamilyMember generated by hbm2java
 */
public class FamilyMember implements java.io.Serializable {

    private String familyMemberId;

    private String familyId;
    
    private String familyName;

    private String familyMemberName;

    private String systemMemberId;

    private String familyMemberCard;

    private Date familyMemberBirthdate;

    private String familyMemberBirthplace;

    private String familyMemberSex;

    private String familyMemberHeight;

    private String familyMemberEducational;

    private String familyMemberProfession;

    private Date familyMemberDeaddate;
    
    private String familyHolder;

    public FamilyMember() {
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public FamilyMember(String familyMemberId) {
        this.familyMemberId = familyMemberId;
    }

    public FamilyMember(String familyMemberId, String familyId, String familyMemberName, String systemMemberId,
            String familyMemberCard, Date familyMemberBirthdate, String familyMemberBirthplace, String familyMemberSex,
            String familyMemberHeight, String familyMemberEducational, String familyMemberProfession,
            Date familyMemberDeaddate, String familyHolder) {
        this.familyMemberId = familyMemberId;
        this.familyId = familyId;
        this.familyMemberName = familyMemberName;
        this.systemMemberId = systemMemberId;
        this.familyMemberCard = familyMemberCard;
        this.familyMemberBirthdate = familyMemberBirthdate;
        this.familyMemberBirthplace = familyMemberBirthplace;
        this.familyMemberSex = familyMemberSex;
        this.familyMemberHeight = familyMemberHeight;
        this.familyMemberEducational = familyMemberEducational;
        this.familyMemberProfession = familyMemberProfession;
        this.familyMemberDeaddate = familyMemberDeaddate;
        this.familyHolder = familyHolder;
    }

    public String getFamilyHolder() {
        return familyHolder;
    }

    public void setFamilyHolder(String familyHolder) {
        this.familyHolder = familyHolder;
    }

    public String getFamilyMemberId() {
        return this.familyMemberId;
    }

    public void setFamilyMemberId(String familyMemberId) {
        this.familyMemberId = familyMemberId;
    }

    public String getFamilyId() {
        return this.familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    public String getFamilyMemberName() {
        return this.familyMemberName;
    }

    public void setFamilyMemberName(String familyMemberName) {
        this.familyMemberName = familyMemberName;
    }

    public String getSystemMemberId() {
        return this.systemMemberId;
    }

    public void setSystemMemberId(String systemMemberId) {
        this.systemMemberId = systemMemberId;
    }

    public String getFamilyMemberCard() {
        return this.familyMemberCard;
    }

    public void setFamilyMemberCard(String familyMemberCard) {
        this.familyMemberCard = familyMemberCard;
    }

    public Date getFamilyMemberBirthdate() {
        return this.familyMemberBirthdate;
    }

    public void setFamilyMemberBirthdate(Date familyMemberBirthdate) {
        this.familyMemberBirthdate = familyMemberBirthdate;
    }

    public String getFamilyMemberBirthplace() {
        return this.familyMemberBirthplace;
    }

    public void setFamilyMemberBirthplace(String familyMemberBirthplace) {
        this.familyMemberBirthplace = familyMemberBirthplace;
    }

    public String getFamilyMemberSex() {
        return this.familyMemberSex;
    }

    public void setFamilyMemberSex(String familyMemberSex) {
        this.familyMemberSex = familyMemberSex;
    }

    public String getFamilyMemberHeight() {
        return this.familyMemberHeight;
    }

    public void setFamilyMemberHeight(String familyMemberHeight) {
        this.familyMemberHeight = familyMemberHeight;
    }

    public String getFamilyMemberEducational() {
        return this.familyMemberEducational;
    }

    public void setFamilyMemberEducational(String familyMemberEducational) {
        this.familyMemberEducational = familyMemberEducational;
    }

    public String getFamilyMemberProfession() {
        return this.familyMemberProfession;
    }

    public void setFamilyMemberProfession(String familyMemberProfession) {
        this.familyMemberProfession = familyMemberProfession;
    }

    public Date getFamilyMemberDeaddate() {
        return this.familyMemberDeaddate;
    }

    public void setFamilyMemberDeaddate(Date familyMemberDeaddate) {
        this.familyMemberDeaddate = familyMemberDeaddate;
    }

}
