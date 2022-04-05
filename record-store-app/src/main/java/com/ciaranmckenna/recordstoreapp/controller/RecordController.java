package com.ciaranmckenna.recordstoreapp.controller;

import com.ciaranmckenna.recordstoreapp.model.Record;
import com.ciaranmckenna.recordstoreapp.repository.RecordRepository;
import com.ciaranmckenna.recordstoreapp.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RecordController {

    @Autowired
    RecordService recordService;

    @Autowired
    RecordRepository recordRepository;

    @PostMapping("/records/save")
    private int saveRecord(@RequestBody Record record)
    {
        recordService.save(record);
        return record.getId();
    }

    @GetMapping("/records")
    public List<Record> getAllRecords()
    {
        return recordService.getAllRecords();
    }

    @GetMapping("/records/{id}")
    private ResponseEntity<Record> getRecordById(@PathVariable("id") int id)
    {
        Optional<Record> recordData = recordRepository.findById(id);
        return recordData.map(organization -> new ResponseEntity<>(organization, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
