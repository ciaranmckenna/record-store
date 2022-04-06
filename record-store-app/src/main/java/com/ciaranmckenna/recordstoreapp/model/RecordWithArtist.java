package com.ciaranmckenna.recordstoreapp.model;

import java.util.List;

public class RecordWithArtist {

    private Integer artistId;
    private String firstName;
    private String lastName;

    private Integer recordId;
    private String recordName;

    private List<Artist> artistList;
    private List<Record> recordList;

    public RecordWithArtist() {
    }

    public RecordWithArtist(final List<Artist> artistList, final List<Record> recordList) {
        this.artistList = artistList;
        this.recordList = recordList;
    }

    public RecordWithArtist(final Integer artistId, final String firstName, final String lastName, final Integer recordId, final String recordName) {
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

    public List<Artist> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<Artist> artistList) {
        this.artistList = artistList;
    }

    public List<Record> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<Record> recordList) {
        this.recordList = recordList;
    }
}