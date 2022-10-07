//@Requestbody 테스트용 DTO(data transfer object)

package com.example.todo_fullstack.dto;

import lombok.Data;

@Data
public class TestRequestBodyDTO {
    private int id;
    private  String message;
}
