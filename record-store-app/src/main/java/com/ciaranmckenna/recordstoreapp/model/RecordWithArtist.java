package com.ciaranmckenna.recordstoreapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name= "artist_record_lookup")
public class RecordWithArtist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "artist_id")
    private Integer artistId;
    @Column(name = "record_id")
    private Integer recordId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

}