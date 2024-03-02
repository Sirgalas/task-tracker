package ru.sergalas.taskTraker.domains.dto;

import ru.sergalas.taskTraker.domains.task.Status;

import java.time.LocalDateTime;

public class TaskData {
    private Long id;
    private String title;
    private String description;
    private Status status;
    private LocalDateTime startTime;
    private LocalDateTime expiredTime;
}
