package ru.sergalas.taskTraker.domains.mappers;

import org.mapstruct.Mapper;
import ru.sergalas.taskTraker.domains.dto.TaskData;
import ru.sergalas.taskTraker.domains.task.Task;

@Mapper
public interface TaskMappers {
    TaskData toDto(Task task);

    Task toEntity(TaskData taskData);

}
