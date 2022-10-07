package com.example.todo_fullstack.controller;

import org.springframework.web.bind.annotation.*;

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
}
