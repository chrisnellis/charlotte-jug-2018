package io.nellis.videogameinventory.model.entity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VideoGameTest {

    @Test
    public void copyConstructor() {
        VideogameEntity input = new VideogameEntity();

        input.setVideogameName("name");
        input.setMaxPlayers(1);
        input.setPlatform("platform");

        VideoGame output = new VideoGame(input);

        assertEquals("name", output.getName());
        assertEquals(1, output.getMaxPlayers());
        assertEquals("platform", output.getPlatform());
    }
}