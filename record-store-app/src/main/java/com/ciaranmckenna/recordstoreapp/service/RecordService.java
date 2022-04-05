package com.ciaranmckenna.recordstoreapp.service;

import com.ciaranmckenna.recordstoreapp.model.Record;
import com.ciaranmckenna.recordstoreapp.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecordService {

    @Autowired
    RecordRepository recordRepository;

    private final List<Record> records = new ArrayList<>();

    public List<Record> getAllRecords() {
        recordRepository.findAll().forEach(records::add);
        return records;
    }

    public void save(Record record)
    {
        recordRepository.save(record);
    }

}
