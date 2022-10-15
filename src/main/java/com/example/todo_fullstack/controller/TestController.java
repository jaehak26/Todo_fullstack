package com.example.todo_fullstack.controller;

import com.example.todo_fullstack.dto.ResponseDTO;
import com.example.todo_fullstack.model.TodoEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@RestController             //rest api controller
// 링크를 클래스 단위로 지정하고 GetMapping. PostMapping PutMapping, DeleteMapping으로 간략하게 만듦
@RequestMapping(path="test") // ~/test의 형태로 매핑

public class TestController {
    @GetMapping()
    public String testController() {
        return "Hello world";
    }

    @GetMapping("/testGetMapping")
    public String testControllerWithPath() {
        return "Hello world testGetMapping ";
    }

    //@PathVariable 사용
    @GetMapping("{/id}")
    public String testControllerWithPathVariable(@PathVariable(required = false) int id){
        return "Hello World" +id;
    }

    //@RequestParam 사용
    @GetMapping(path="/testRequestParam")
    public String testControllerRequstParam(@RequestParam(required = false) int id){
        return "Hello World id=" + id;
    }

    //ResponseDTO를 반환하는 메서드
    @GetMapping(path="/testResponsebody")
    public ResponseDTO<String> testControllerResponseBody(){
        List<String> list = new ArrayList<>();
        list.add("Hello world! I'm ResponseDTO<String>");
        ResponseDTO<String> res = ResponseDTO.<String>builder().data(list).build();
        return res;
    }

    //ResponseEntity를 반환하는 메서드
    @GetMapping("/testResponseEntity")
    public ResponseEntity<?> testControllerResponseEntity(){
        //body 설정
        List<String> list = new ArrayList<>();
        list.add("Hello world! I'm responseEntity. And you got 200!");

        ResponseDTO<String> res = ResponseDTO.<String>builder().data(list).build();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        return ResponseEntity.ok().headers(headers).body(res);
    }

}
