package com.jhipstercourse.tasks.controller;

import com.jhipstercourse.tasks.domain.Task;
import com.jhipstercourse.tasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping(value = "/tasks", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Task> list() {
        return this.taskService.list();
    }

    @PostMapping(value = "/tasks/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Task saveTask(@RequestBody Task task) {
        return this.taskService.save(task);
    }

}
