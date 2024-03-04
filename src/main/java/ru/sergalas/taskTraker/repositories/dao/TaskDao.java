package ru.sergalas.taskTraker.repositories.dao;

import ru.sergalas.taskTraker.web.dto.task.TaskData;

import java.util.List;
import java.util.Optional;

public interface TaskDao {
    Optional<TaskData> findById(Long Id);

    List<TaskData> findAllByUserId(Long userId);

}
