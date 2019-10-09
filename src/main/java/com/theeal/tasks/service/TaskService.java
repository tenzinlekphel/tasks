package com.theeal.tasks.service;

import com.theeal.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
