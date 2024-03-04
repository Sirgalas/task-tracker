package ru.sergalas.taskTraker.repositories.dao;

import ru.sergalas.taskTraker.web.dto.user.UserData;

import java.util.Optional;

public interface UserDao {

    Optional<UserData> findById(Long id);

    Optional<UserData> findByUserName(String username);

    Boolean IsTaskOwner(Long userId, Long taskId);

}
