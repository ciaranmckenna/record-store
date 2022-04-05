package com.ciaranmckenna.recordstoreapp.controller;

import com.ciaranmckenna.recordstoreapp.model.Record;
import com.ciaranmckenna.recordstoreapp.repository.RecordRepository;
import com.ciaranmckenna.recordstoreapp.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecordController {

    @Autowired
    RecordService recordService;

    @Autowired
    RecordRepository recordRepository;

    @GetMapping("/records")
    public List<Record> getAllRecords()
    {
        return recordService.getAllRecords();
    }

    @PostMapping("/record/save")
    private int saveRecord(@RequestBody Record record)
    {
        recordService.save(record);
        return record.getId();
    }

}
