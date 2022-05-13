package com.ciaranmckenna.recordstoreapp.service;

import com.ciaranmckenna.recordstoreapp.model.Artist;
import com.ciaranmckenna.recordstoreapp.model.Record;
import com.ciaranmckenna.recordstoreapp.model.RecordWithArtist;
import com.ciaranmckenna.recordstoreapp.repository.ArtistRepository;
import com.ciaranmckenna.recordstoreapp.repository.RecordRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class RecordService {

    private final RecordRepository recordRepository;

    public RecordService(final RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public List<Record> getAllRecords() {
        return recordRepository.findAll();
    }

    public Record save(final Record record)
    {
        return recordRepository.save(record);
    }

    public Record getById(final Integer id){
        return recordRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }


}
