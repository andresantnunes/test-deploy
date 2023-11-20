package com.example.demoaula.controller;

import com.example.demoaula.dataprovider.Task;
import com.example.demoaula.service.TaskService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;
    @GetMapping
    public ResponseEntity<List<Task>> taskList(){
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void postTask(@RequestBody Task task){
        taskService.createTask(task);
    }

}
