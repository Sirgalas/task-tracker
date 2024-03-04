package ru.sergalas.taskTraker.repositories.mappers;

import org.mapstruct.Mapper;
import ru.sergalas.taskTraker.web.dto.task.TaskData;
import ru.sergalas.taskTraker.domains.task.Task;

@Mapper
public interface TaskMappers {
    TaskData toDto(Task task);

    Task toEntity(TaskData taskData);

}
