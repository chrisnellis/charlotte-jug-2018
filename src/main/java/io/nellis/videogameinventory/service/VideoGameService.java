package io.nellis.videogameinventory.service;

import io.nellis.videogameinventory.model.entity.VideoGame;
import io.nellis.videogameinventory.model.entity.VideogameEntity;
import io.nellis.videogameinventory.repository.VideogameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VideoGameService {
    private VideogameRepo repo;

    @Autowired
    public VideoGameService(VideogameRepo repo) {
        this.repo = repo;
    }

    public List<VideoGame> getAllGames() {
        List<VideogameEntity> videogameEntities = repo.findAll();
        List<VideoGame> games = videogameEntities.stream()
                .map(entity -> new VideoGame(entity))
                .collect(Collectors.toList());
        return games;

    }
}

