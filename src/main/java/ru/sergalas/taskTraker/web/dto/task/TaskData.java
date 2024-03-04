package ru.sergalas.taskTraker.web.dto.task;

import lombok.Data;
import ru.sergalas.taskTraker.domains.task.Status;

import java.time.LocalDateTime;

@Data
public class TaskData {
    private Long id;
    private String title;
    private String description;
    private Status status;
    private LocalDateTime startTime;
    private LocalDateTime expiredTime;
}
