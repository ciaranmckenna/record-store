package com.ciaranmckenna.recordstoreapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Record {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer artistId;

    public Record() {
    }

    public Record(final Integer id, final String title, final Integer artistId) {
        this.id = id;
        this.name = title;
        this.artistId = artistId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

}
