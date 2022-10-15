package com.example.todo_fullstack.controller;

import com.example.todo_fullstack.Service.TodoService;
import com.example.todo_fullstack.TodoFullstackApplication;
import com.example.todo_fullstack.dto.ResponseDTO;
import com.example.todo_fullstack.dto.TodoDTO;
import com.example.todo_fullstack.model.TodoEntity;
import com.fasterxml.jackson.databind.deser.Deserializers;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/todo")
public class TodoController {

    @Autowired
    private TodoService service;


    @GetMapping()
    public ResponseEntity<?> testTodo(){

        String str = service.testService();
        List<String> list = new ArrayList<>();
        list.add(str);

        ResponseDTO<String> res = ResponseDTO.<String>builder().data(list).build();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        return ResponseEntity.ok().headers(headers).body(res);

    }


}
