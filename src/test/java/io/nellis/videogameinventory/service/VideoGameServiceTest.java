package io.nellis.videogameinventory.service;

import io.nellis.videogameinventory.model.entity.VideoGame;
import io.nellis.videogameinventory.model.entity.VideogameEntity;
import io.nellis.videogameinventory.repository.VideogameRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(SpringRunner.class)
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

    @Test
    public void getGamesWithMinPlayers() {
        VideogameEntity game1 = new VideogameEntity();
        game1.setVideogameName("Mario");
        game1.setMaxPlayers(4);
        game1.setPlatform("Wii");

        VideogameEntity game2 = new VideogameEntity();
        game2.setVideogameName("Mario Kart");
        game2.setMaxPlayers(5);
        game2.setPlatform("Switch");

        when(mockRepo.findByMaxPlayersIsGreaterThanEqual(4)).thenReturn(Arrays.asList(game1, game2));

        List<VideoGame> games = subject.getGamesWithMinPlayers(4);

        verify(mockRepo).findByMaxPlayersIsGreaterThanEqual(4);

        assertEquals(2, games.size());
        assertEquals("Mario", games.get(0).getName());

    }

    @Test
    public void getGamesWithMinPlayersTheSecond() {
        subject.getGamesWithMinPlayers(5);

        verify(mockRepo).findByMaxPlayersIsGreaterThanEqual(5);
    }
}