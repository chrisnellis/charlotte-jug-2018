package io.nellis.videogameinventory.model.entity;

import java.util.List;

public class GameResponse {
    private List<VideoGame> games;

    public List<VideoGame> getGames() {
        return games;
    }

    public void setGames(List<VideoGame> games) {
        this.games = games;
    }
}
