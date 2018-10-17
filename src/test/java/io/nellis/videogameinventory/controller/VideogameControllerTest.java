package io.nellis.videogameinventory.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(VideogameController.class)
public class VideogameControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void responsePayload() throws Exception {
        mockMvc.perform(get("/games"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.games").isArray())
                .andExpect(jsonPath("$.games[0]").isMap())
                .andExpect(jsonPath("$.games[0].name").isString())
                .andExpect(jsonPath("$.games[0].maxPlayers").isNumber())
                .andExpect(jsonPath("$.games[0].platform").isString())
        ;
    }
}