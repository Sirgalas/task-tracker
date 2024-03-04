package ru.sergalas.taskTraker.repositories.impl.dao;

import org.springframework.stereotype.Component;
import ru.sergalas.taskTraker.web.dto.task.TaskData;
import ru.sergalas.taskTraker.repositories.dao.TaskDao;

import java.util.List;
import java.util.Optional;

@Component
public class TaskDaoImpl implements TaskDao {
    @Override
    public Optional<TaskData> findById(Long Id) {
        return Optional.empty();
    }

    @Override
    public List<TaskData> findAllByUserId(Long userId) {
        return null;
    }
}
