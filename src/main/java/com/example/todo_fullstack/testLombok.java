package com.example.todo_fullstack;

import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Builder
@RequiredArgsConstructor
public class testLombok {

    @NonNull
    private String id;
}
