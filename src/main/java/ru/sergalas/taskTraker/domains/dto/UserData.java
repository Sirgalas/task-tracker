package ru.sergalas.taskTraker.domains.dto;

import ru.sergalas.taskTraker.domains.task.Task;
import ru.sergalas.taskTraker.domains.user.Role;

import java.util.List;
import java.util.Set;

public class UserData {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String passwordConfirm;
    private Set<Role> roles;
    private List<Task> tasks;
    private Role role;
}
