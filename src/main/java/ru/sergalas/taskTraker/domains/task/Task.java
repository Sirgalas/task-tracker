package ru.sergalas.taskTraker.domains.task;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Task {

    private Long id;
    private String title;
    private String description;
    private Status status;
    private LocalDateTime startTime;
    private LocalDateTime expiredTime;
}
