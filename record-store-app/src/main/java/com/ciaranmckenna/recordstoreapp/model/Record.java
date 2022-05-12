package com.ciaranmckenna.recordstoreapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    /*@Column(name = "artist_Id")
    private Integer artistId;*/

    @ManyToOne
    @JoinColumn(name = "artist_id", referencedColumnName = "id")
    private Artist artist;

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Record() {
    }

    public Record(final Integer id, final String title, Artist artist) {
        this.id = id;
        this.name = title;
        //this.artistId = artistId;
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

    /*public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }*/

}
