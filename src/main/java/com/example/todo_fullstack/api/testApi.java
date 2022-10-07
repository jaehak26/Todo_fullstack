package com.example.todo_fullstack.api;

import com.google.common.net.HttpHeaders;

import okhttp3.*;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.IOException;

@RestController
public class testApi {

    @GetMapping("/api")
    public String getApi() throws IOException {

        WebClient webClient = WebClient.create();



        return webClient.get()
                .uri("http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieList.json?key=e047c2ef1e69765974722e6fda75e84c")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
    @GetMapping("/api2")
    public String getApi2() {
        WebClient webClient = WebClient.create();


        return  webClient.get()
                .uri("http://www.opinet.co.kr/api/avgAllPrice.do?out=json&code=F220510141")
                .header("Cookie",
                        "JSESSIONID=aVMWjSbDhIJ8amuWl0vhOWzwd0fXgv1wahHBr0izqYaBDr6mbFyv6c0UxQOjXmnM.b3BpbmV0X2RvbWFpbi9vcGluZXQxLTE=; WMONID=DJMird2Crb_")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                .block();

    }
}
