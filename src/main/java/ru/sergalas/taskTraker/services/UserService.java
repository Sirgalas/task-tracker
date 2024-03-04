package ru.sergalas.taskTraker.services;

import ru.sergalas.taskTraker.domains.user.User;

public interface UserService {
    User getById(Long id);

    User getByUsername();

    User update(User user);

    User create(User user);

    Boolean isTaskOwner(Long userId, Long taskId);

    void delete(User user);
}
