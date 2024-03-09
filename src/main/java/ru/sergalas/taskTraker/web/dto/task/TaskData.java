package ru.sergalas.taskTraker.web.dto.task;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import ru.sergalas.taskTraker.domains.task.Status;
import ru.sergalas.taskTraker.web.dto.validation.OnCreate;
import ru.sergalas.taskTraker.web.dto.validation.OnUpdate;

import java.time.LocalDateTime;

@Data
public class TaskData {
    @NotNull(message = "Id must be not null", groups = OnUpdate.class)
    private Long id;

    @Length(max= 255, message = "Title length must be smaller than 255 symbol", groups = {OnCreate.class, OnUpdate.class})
    @NotNull(message = "Title must be not null", groups = {OnCreate.class, OnUpdate.class})
    private String title;

    @Length(max= 610, message = "Description length must be smaller than 255 symbol", groups = {OnCreate.class, OnUpdate.class})
    private String description;


    private Status status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "dd:MM:yyy HH:mm")
    private LocalDateTime startTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "dd:MM:yyy HH:mm")
    private LocalDateTime expiredTime;
}
