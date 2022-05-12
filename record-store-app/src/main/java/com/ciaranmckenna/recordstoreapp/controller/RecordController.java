package com.ciaranmckenna.recordstoreapp.controller;

import com.ciaranmckenna.recordstoreapp.model.Record;
import com.ciaranmckenna.recordstoreapp.model.RecordWithArtist;
import com.ciaranmckenna.recordstoreapp.service.RecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/records")
public class RecordController {

    private final RecordService recordService;

    public RecordController(final RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping
    public ResponseEntity<List<Record>> getAll()
    {
        return ResponseEntity.ok(recordService.getAllRecords());
    }

    @GetMapping("/{id}")
    private ResponseEntity<Record> getById(@PathVariable("id") final Integer id)
    {
        return ResponseEntity.ok(recordService.getById(id));
    }

    @PostMapping("/save")
    private ResponseEntity<Record> saveRecord(@RequestBody final Record record)
    {
        return ResponseEntity.ok(recordService.save(record));
    }

    /*@GetMapping("/{id}/artist")
    private ResponseEntity<Record> getRecordWithArtistInformation(@PathVariable("id") final Integer id)
    {
        return ResponseEntity.ok(recordService.getRecordWithArtistInformation(id));
    }*/


}
