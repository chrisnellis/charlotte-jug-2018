package io.nellis.videogameinventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "videogame")
public class VideogameEntity {

    @Column
    @Id
    private int id;

    @Column(name = "videogame_name")
    private String videogameName;

    @Column(name = "max_players")
    private int maxPlayers;

    @Column
    private String platform;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideogameName() {
        return videogameName;
    }

    public void setVideogameName(String videogameName) {
        this.videogameName = videogameName;
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
