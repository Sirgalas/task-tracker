package ru.sergalas.taskTraker.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.sergalas.taskTraker.domains.task.Task;
import ru.sergalas.taskTraker.repositories.dao.TaskDao;
import ru.sergalas.taskTraker.repositories.jpa.TaskRepository;
import ru.sergalas.taskTraker.services.TaskService;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskDao taskDao;
    private final TaskRepository taskRepository;

    @Override
    public Task getById() {
        return null;
    }

    @Override
    public Task findAllByUserId() {
        return null;
    }

    @Override
    public Task create(Task task) {
        return null;
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public void delete(Task task) {

    }
}
