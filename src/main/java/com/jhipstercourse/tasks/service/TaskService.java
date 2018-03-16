package com.jhipstercourse.tasks.service;

import com.jhipstercourse.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);

}
