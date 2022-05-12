package com.ciaranmckenna.recordstoreapp.repository;

import com.ciaranmckenna.recordstoreapp.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {
}
