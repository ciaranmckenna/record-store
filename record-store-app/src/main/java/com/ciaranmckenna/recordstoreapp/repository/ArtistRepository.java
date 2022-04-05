package com.ciaranmckenna.recordstoreapp.repository;

import com.ciaranmckenna.recordstoreapp.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Integer> {
}
