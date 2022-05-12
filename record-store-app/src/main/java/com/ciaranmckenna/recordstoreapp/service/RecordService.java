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
import java.util.Optional;

@Service
public class RecordService {

    private final RecordRepository recordRepository;
    private final ArtistRepository artistRepository;

    public RecordService(final RecordRepository recordRepository,
                         final ArtistRepository artistRepository) {
        this.recordRepository = recordRepository;
        this.artistRepository = artistRepository;
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

    /*public RecordWithArtist getRecordWithArtistInformation(Integer id) {

        Record record = getById(id);

        Optional<Artist> artist = artistRepository.findById(record.getArtistId());

        return new RecordWithArtist(artist.get().getId(), artist.get().getFirstName(), artist.get().getLastName(), record.getId(), record.getName());
    }

    public RecordWithArtist getAllRecordsWithArtistInformation() {

        List<Record> recordList = recordRepository.findAll();

        List <Artist> artistList = artistRepository.findAll();

        return new RecordWithArtist(artistList, recordList);
    }*/

}
