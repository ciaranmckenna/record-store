package com.ciaranmckenna.recordstoreapp.model;

public class RecordWithArtist {

    private Integer artistId;
    private String firstName;
    private String lastName;

    private Integer recordId;
    private String recordName;

    public RecordWithArtist() {
    }

    public RecordWithArtist(Integer artistId, String firstName, String lastName, Integer recordId, String recordName) {
        this.artistId = artistId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.recordId = recordId;
        this.recordName = recordName;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }
}