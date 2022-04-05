package com.ciaranmckenna.recordstoreapp.repository;

import com.ciaranmckenna.recordstoreapp.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface RecordRepository extends CrudRepository<Artist, Integer> {
}
