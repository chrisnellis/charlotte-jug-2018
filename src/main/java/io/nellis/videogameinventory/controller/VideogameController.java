package io.nellis.videogameinventory.controller;

import io.nellis.videogameinventory.model.entity.GameResponse;
import io.nellis.videogameinventory.model.entity.VideoGame;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VideogameController {

    @GetMapping("/games")
    public ResponseEntity<?> getGames() {

        GameResponse response = new GameResponse();

        List<VideoGame> listOfGames = new ArrayList<>();
        VideoGame game1 = new VideoGame();
        game1.setName("name");
        game1.setPlatform("platform");

        listOfGames.add(game1);

        response.setGames(listOfGames);

        return new ResponseEntity<GameResponse>(response, HttpStatus.OK);
    }
}
