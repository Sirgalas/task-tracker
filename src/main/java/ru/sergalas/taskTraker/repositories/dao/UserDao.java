package ru.sergalas.taskTraker.repositories.dao;

import ru.sergalas.taskTraker.domains.user.User;

import java.util.Optional;

public interface UserDao {

    Optional<User> findById(Long id);

    Optional<User> findByUserName(String username);

    boolean IsTaskOwner(Long userId, Long taskId);
}
