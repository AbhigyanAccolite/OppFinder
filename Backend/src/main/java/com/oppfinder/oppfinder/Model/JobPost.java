package com.oppfinder.oppfinder.Model;

public class JobPost {
    private String id;
    private int profileId;
    private String description;
    private int locationId;
    private boolean isActive;
    private int openings;
    private String postedOn;
    private String postedBy;
    private String lastUpdatedOn;
    private String lastEditedBy;
    private int employmentTypeId;

    public JobPost() {

    }

    public JobPost(String id, int profileId, String description, int locationId, boolean isActive,
            int openings, String postedOn, String postedBy, String lastUpdatedOn, String lastEditedBy,
            int employmentTypeId) {
        this.id = id;
        this.profileId = profileId;
        this.description = description;
        this.locationId = locationId;
        this.isActive = isActive;
        this.openings = openings;
        this.postedOn = postedOn;
        this.postedBy = postedBy;
        this.lastUpdatedOn = lastUpdatedOn;
        this.lastEditedBy = lastEditedBy;
        this.employmentTypeId = employmentTypeId;
    }



    public int getEmploymentTypeId() {
        return employmentTypeId;
    }

    public void setEmploymentTypeId(int employmentTypeId) {
        this.employmentTypeId = employmentTypeId;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getOpenings() {
        return openings;
    }

    public void setOpenings(int openings) {
        this.openings = openings;
    }


    public String getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(String postedOn) {
        this.postedOn = postedOn;
    }

    public String getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public String getLastEditedBy() {
        return lastEditedBy;
    }

    public void setLastEditedBy(String lastEditedBy) {
        this.lastEditedBy = lastEditedBy;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }


}
