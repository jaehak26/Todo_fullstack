//@RequestBody 테스트용 rest 컨트롤러
package com.example.todo_fullstack.controller;


import com.example.todo_fullstack.dto.TestRequestBodyDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/RequestBody")
public class TestRequestBodyController {

    @GetMapping()
    public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO){
        return "Hellp world id = " + testRequestBodyDTO.getId() + "\nMessage = " + testRequestBodyDTO.getMessage();
    }
}
