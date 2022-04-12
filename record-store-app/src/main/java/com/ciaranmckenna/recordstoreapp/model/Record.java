package com.ciaranmckenna.recordstoreapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer recordId;
    private String name;
    private Integer artistId;

    @ManyToMany
    @JoinTable(name = "artist_record", joinColumns = @JoinColumn(name = "record_id"),
            inverseJoinColumns = @JoinColumn(name = "artist_id"))
    private Set<Artist> artists = new HashSet<>();

    public Record() {
    }

    public Record( final String title) {
        this.name = title;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer id) {
        this.recordId = id;
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

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "Record{" +
                "recordId=" + recordId +
                ", name='" + name + '\'' +
                ", artistId=" + artistId +
                ", artists=" + artists +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        return recordId != null ? recordId.equals(record.recordId) : record.recordId == null;
    }

    @Override
    public int hashCode() {
        return recordId != null ? recordId.hashCode() : 0;
    }

}
