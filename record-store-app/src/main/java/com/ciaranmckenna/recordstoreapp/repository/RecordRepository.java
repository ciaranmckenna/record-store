package com.ciaranmckenna.recordstoreapp.repository;

import com.ciaranmckenna.recordstoreapp.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Integer> {
}
