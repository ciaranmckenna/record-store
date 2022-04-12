package com.ciaranmckenna.recordstoreapp.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer artistId;

    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "artists")
    private Set<Record> records = new HashSet<>();

    public Artist() {
    }

    public Artist(final String firstName, final String lastName) {
        // this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer id) {
        this.artistId = id;
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

    public Set<Record> getRecords() {
        return records;
    }

    public void setRecords(Set<Record> records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + artistId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", records=" + records +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artist artist = (Artist) o;

        return artistId != null ? artistId.equals(artist.artistId) : artist.artistId == null;
    }

    @Override
    public int hashCode() {
        return artistId != null ? artistId.hashCode() : 0;
    }
}
