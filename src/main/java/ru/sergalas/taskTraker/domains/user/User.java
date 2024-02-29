package ru.sergalas.taskTraker.domains.user;

import lombok.Data;
import ru.sergalas.taskTraker.domains.task.Task;

import java.util.List;
import java.util.Set;

@Data
public class User {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String passwordConfirm;
    private Set<Role> roles;
    private List<Task> tasks;
}
