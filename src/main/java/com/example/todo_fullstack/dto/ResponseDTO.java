//http와의 통신을 담당할 DTO(data transfer object)

package com.example.todo_fullstack.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
//제네릭 타입 - 객체 선언 시 타입을 지정한다.
public class ResponseDTO<T> {

    private String error;
    private List<T> data;

}
