package io.nellis.videogameinventory.model.entity;

public class VideoGame {
    private String name;
    private int maxPlayers;
    private String platform;

    public VideoGame() {

    }

    public VideoGame(VideogameEntity entity) {
        this.name = entity.getVideogameName();
        this.maxPlayers = entity.getMaxPlayers();
        this.platform = entity.getPlatform();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
