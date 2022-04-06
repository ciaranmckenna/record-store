package com.ciaranmckenna.recordstoreapp.controller;

import com.ciaranmckenna.recordstoreapp.model.Artist;
import com.ciaranmckenna.recordstoreapp.model.Record;
import com.ciaranmckenna.recordstoreapp.repository.ArtistRepository;
import com.ciaranmckenna.recordstoreapp.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController("/artist")
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(final ArtistService artistService) {
        this.artistService = artistService;
    }

    /*@GetMapping("{id}")
    private ResponseEntity<Artist> getArtistByIdWithRecordInfo(@PathVariable("id") int id) {
        return ResponseEntity.ok(artistService)
    }

    @GetMapping("/{id}")
    private ResponseEntity<Record> getById(@PathVariable("id") final int id)
    {
        return ResponseEntity.ok(recordService.getById(id));
    }*/

}
