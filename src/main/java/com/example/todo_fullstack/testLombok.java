package com.example.todo_fullstack;

import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//컴파일 시 에러가 없으면 테스트 성공
@Builder
@RequiredArgsConstructor
public class testLombok {

    @NonNull
    private String id;
}
