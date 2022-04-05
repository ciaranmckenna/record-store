package com.ciaranmckenna.recordstoreapp.repository;

import com.ciaranmckenna.recordstoreapp.model.Artist;
import com.ciaranmckenna.recordstoreapp.model.Record;
import org.springframework.data.repository.CrudRepository;

public interface RecordRepository extends CrudRepository<Record, Integer> {
}
