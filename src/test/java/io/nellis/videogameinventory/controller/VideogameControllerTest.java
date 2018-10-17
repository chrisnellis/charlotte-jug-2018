package io.nellis.videogameinventory.controller;

import io.nellis.videogameinventory.model.entity.VideoGame;
import io.nellis.videogameinventory.service.VideoGameService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(VideogameController.class)
public class VideogameControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    VideoGameService mockService;

    @Test
    public void responsePayload() throws Exception {
        VideoGame game1 = new VideoGame();
        game1.setName("game1");
        game1.setMaxPlayers(1);
        game1.setPlatform("platform");

        VideoGame game2 = new VideoGame();
        game2.setName("game2");
        game2.setMaxPlayers(2);
        game2.setPlatform("platform2");

        List<VideoGame> gamesList = new ArrayList<>();

        gamesList.add(game1);
        gamesList.add(game2);

        when(mockService.getAllGames()).thenReturn(gamesList);

        mockMvc.perform(get("/games"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.games").isArray())
                .andExpect(jsonPath("$.games[0]").isMap())
                .andExpect(jsonPath("$.games[0].name").isString())
                .andExpect(jsonPath("$.games[0].name").value("game1"))
                .andExpect(jsonPath("$.games[0].maxPlayers").isNumber())
                .andExpect(jsonPath("$.games[0].maxPlayers").value(1))
                .andExpect(jsonPath("$.games[0].platform").isString())
                .andExpect(jsonPath("$.games[0].platform").value("platform"))
                .andExpect(jsonPath("$.games[1].name").isString())
                .andExpect(jsonPath("$.games[1].name").value("game2"))
                .andExpect(jsonPath("$.games[1].maxPlayers").isNumber())
                .andExpect(jsonPath("$.games[1].maxPlayers").value(2))
                .andExpect(jsonPath("$.games[1].platform").isString())
                .andExpect(jsonPath("$.games[1].platform").value("platform2"))
        ;


        verify(mockService).getAllGames();
    }
}