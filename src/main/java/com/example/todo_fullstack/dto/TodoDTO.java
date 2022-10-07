//이 클래스를 이용해 todo아이템을 생성 삭제 수정하 예정
//dto는 기보적으로 변수와 getter/setter로만 구성되어 있다

package com.example.todo_fullstack.dto;

import com.example.todo_fullstack.model.TodoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoDTO {
    private String id;      //객체아이디
    private String title;   //todo타이틀
    private  boolean done;  //할 일을 했는지 여부

    //생성자 - todo엔티티를 arg로 받는
    //todo엔티티의 값을 받아 저장함
    public TodoDTO (final TodoEntity entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.done = entity.isDone();
    }


}
