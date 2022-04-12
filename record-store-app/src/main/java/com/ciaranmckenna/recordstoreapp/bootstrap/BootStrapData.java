package com.ciaranmckenna.recordstoreapp.bootstrap;

import com.ciaranmckenna.recordstoreapp.model.Artist;
import com.ciaranmckenna.recordstoreapp.model.Record;
import com.ciaranmckenna.recordstoreapp.repository.ArtistRepository;
import com.ciaranmckenna.recordstoreapp.repository.RecordRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final ArtistRepository artistRepository;
    private final RecordRepository recordRepository;

    public BootStrapData(final ArtistRepository artistRepository, final RecordRepository recordRepository) {
        this.artistRepository = artistRepository;
        this.recordRepository = recordRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Artist john = new Artist("John", "Lennon");
        Artist stevie = new Artist("Stevie", "Nicks");
        Artist johnny = new Artist("Johnny", "Cash");
        Artist Luke = new Artist("Luke", "Kelly");

        Record imagine = new Record("Imagine");
        Record edge = new Record("Edge of 17");
        Record walk = new Record("Walk The Line");
        Record raglan = new Record("Raglan Road");
        Record night = new Record("Night Visiting Song");
        Record black = new Record("Black Velvet Band");

        john.getRecords().add(imagine);
        imagine.getArtists().add(john);

        artistRepository.save(john);
        recordRepository.save(imagine);

        stevie.getRecords().add(edge);
        edge.getArtists().add(stevie);

        artistRepository.save(stevie);
        recordRepository.save(edge);

        johnny.getRecords().add(walk);
        walk.getArtists().add(johnny);

        artistRepository.save(johnny);
        recordRepository.save(walk);

        john.getRecords().add(imagine);
        imagine.getArtists().add(john);

        artistRepository.save(john);
        recordRepository.save(imagine);


        System.out.println("Number of books: " + recordRepository.count());
    }
}
