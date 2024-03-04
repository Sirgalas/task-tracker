package ru.sergalas.taskTraker.services;

import ru.sergalas.taskTraker.domains.task.Task;
import ru.sergalas.taskTraker.domains.user.User;

public interface TaskService {

    Task getById();

    Task findAllByUserId();

    Task create(Task task);

    Task update(Task task);

    void delete(Task task);
}
