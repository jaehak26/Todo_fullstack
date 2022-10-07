package com.example.todo_fullstack.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder            //객체 생성 시 빌더 패턴으로 생성할 수 있게 함
@NoArgsConstructor  //Arg가 없는 생성자 자동생성
@AllArgsConstructor //class의 모든 Arg를 갖는 생성자 자동생성
@Data               //@Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode을 한꺼번에 설정
public class TodoEntity {
    private String id;      //객체 아이디
    private String userId;  //사용자 아이디
    private String title;   //todo 타이틀
    private boolean done;   //todo를 완료한 경우 - true
}
