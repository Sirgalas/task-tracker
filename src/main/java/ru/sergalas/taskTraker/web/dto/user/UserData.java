package ru.sergalas.taskTraker.web.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import ru.sergalas.taskTraker.domains.task.Task;
import ru.sergalas.taskTraker.domains.user.Role;
import ru.sergalas.taskTraker.web.dto.validation.OnCreate;
import ru.sergalas.taskTraker.web.dto.validation.OnUpdate;

import java.util.List;
import java.util.Set;

@Data
public class UserData {

    @NotNull(message = "Id must be not null", groups = OnUpdate.class)
    private Long id;

    @Length(max= 255, message = "Name length must be smaller than 255 symbol", groups = {OnCreate.class, OnUpdate.class})
    @NotNull(message = "Name must be not null", groups = {OnCreate.class, OnUpdate.class})
    private String name;

    @Length(max= 255, message = "UserName length must be smaller than 255 symbol", groups = {OnCreate.class, OnUpdate.class})
    @NotNull(message = "Username must be not null", groups = {OnCreate.class, OnUpdate.class})
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password must be not null", groups = {OnCreate.class, OnUpdate.class})
    private String password;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Confirmation must be not null", groups = {OnCreate.class})
    private String passwordConfirm;
}
