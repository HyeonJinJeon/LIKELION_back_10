package com.example.restexam.controller;

import com.example.restexam.domain.Todo;
import com.example.restexam.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//web apo -- RESTFul == Rest api (지켜야하는 너무 많은 규칙과 어려움이 있어서.. 모두 다 잘 지키지는 못한다)

//url은 자원 (복수)
//method는 행위
//http://localhost:8080/api/todos        --Get(Read)  --todoList 리턴
//http://localhost:8080/api/todos/{id}   --Get(Read)_  --id에 해당하는 todo를 리턴
//http://localhost:8080/api/todos        --Post(Create) --todo 한 건 저장
//http://localhost:8080/api/todos        --put/patch(Update) --todo 수정
//http://localhost:8080/api/todos        --delete(Delete) --todo 삭제

//위에 처럼 각각의 메서드에 부응하도록 직접 구현을 해줘야된다.
@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping
    public List<Todo> getTodos(){
        return todoService.getTodos();
    }
    @GetMapping("/{id}")
    public Todo getTodo(@PathVariable("id") Long id){
        return todoService.getTodo(id);
    }
    @PostMapping
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo.getTodo());
    }
    //put vs patch    --  수정    put - 자체가 바뀔때..  patch  --  부분만 수정될때
    @PatchMapping("/{id}")
    public Todo updateTodoById(@PathVariable("id") Long id){
        return todoService.updateTodo(id);
    }

    @PatchMapping
    public Todo updateTodo(@RequestBody Todo todo){
        return todoService.updateTodo(todo.getId());
    }
    @DeleteMapping
    public String deleteTodo(@RequestBody Todo todo){
        todoService.deleteTodo(todo.getId());
        return "ok";
    }
}