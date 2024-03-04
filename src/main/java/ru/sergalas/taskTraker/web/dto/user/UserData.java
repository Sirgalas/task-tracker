package ru.sergalas.taskTraker.web.dto.user;

import lombok.Data;
import ru.sergalas.taskTraker.domains.task.Task;
import ru.sergalas.taskTraker.domains.user.Role;

import java.util.List;
import java.util.Set;

@Data
public class UserData {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String passwordConfirm;
}
