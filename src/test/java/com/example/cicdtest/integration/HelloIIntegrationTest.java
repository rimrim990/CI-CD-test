package com.example.cicdtest.integration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@DisplayName("HelloController 통합 테스트")
public class HelloIIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("요청을 보내면 hello 를 반환한다")
    void returnHello() throws Exception {
        mockMvc.perform(get("/hello"))
            .andExpect(status().isOk())
            .andExpect(content().string("hello"));
    }

//    @Test
//    @DisplayName("요청을 보내면 hello 를 반환한다")
//    void helloController() throws Exception {
//        mockMvc.perform(post("/hello"))
//            .andExpect(status().isOk())
//            .andExpect(content().string("hello"));
//    }

    @Test
    @DisplayName("테스트")
    void test() {
        assertThat(true).isTrue();
    }
}
