package io.nellis.videogameinventory.service;

import io.nellis.videogameinventory.model.entity.VideoGame;
import io.nellis.videogameinventory.model.entity.VideogameEntity;
import io.nellis.videogameinventory.repository.VideogameRepo;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class VideoGameServiceTest {
    @Mock
    VideogameRepo mockRepo;

    VideoGameService subject;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        subject = new VideoGameService(mockRepo);
    }

    @Test
    public void getAllGamesMethod() {
        VideogameEntity game1 = new VideogameEntity();
        game1.setVideogameName("name");
        game1.setMaxPlayers(1);
        game1.setPlatform("platform");

        when(mockRepo.findAll()).thenReturn(Arrays.asList(game1));

        List<VideoGame> actualListOfGames = subject.getAllGames();

        verify(mockRepo).findAll();

        assertEquals(1, actualListOfGames.size());
        assertEquals("name", actualListOfGames.get(0).getName());
    }
}