package io.nellis.videogameinventory.controller;

import io.nellis.videogameinventory.model.entity.GameResponse;
import io.nellis.videogameinventory.model.entity.VideoGame;
import io.nellis.videogameinventory.service.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideogameController {
    private VideoGameService service;

    @Autowired
    public VideogameController(VideoGameService service) {
        this.service = service;
    }

    @GetMapping("/games")
    public ResponseEntity<?> getGames() {

        GameResponse response = new GameResponse();

        List<VideoGame> gamesListFromService = service.getAllGames();

        response.setGames(gamesListFromService);

        return new ResponseEntity<GameResponse>(response, HttpStatus.OK);
    }
}
