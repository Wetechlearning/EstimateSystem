package com.we.estimate.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest
class ShaInControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void submitForm() {
        try {
            ResultActions resultActions = mockMvc.perform(post("/shaIn/submit")
                    .param("cdKaisha", "John")
                    .param("cdShain", "Doe"));

            resultActions.andExpect(status().isOk());

        } catch(Exception e) {

        }

    }
}