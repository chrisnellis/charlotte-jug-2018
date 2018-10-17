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

        return transform(videogameEntities);

    }

    public List<VideoGame> getGamesWithMinPlayers(int i) {
        List<VideogameEntity> videogameEntities = repo.findByMaxPlayersIsGreaterThanEqual(i);

        return transform(videogameEntities);
    }

    private List<VideoGame> transform(List<VideogameEntity> entities) {
        return entities.stream()
                .map(entity -> new VideoGame(entity))
                .collect(Collectors.toList());
    }
}

