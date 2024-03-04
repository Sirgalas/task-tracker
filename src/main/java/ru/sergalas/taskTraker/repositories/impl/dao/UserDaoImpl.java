package ru.sergalas.taskTraker.repositories.impl.dao;

import org.springframework.stereotype.Component;
import ru.sergalas.taskTraker.web.dto.user.UserData;
import ru.sergalas.taskTraker.repositories.dao.UserDao;

import java.util.Optional;

@Component
public class UserDaoImpl implements UserDao {
    @Override
    public Optional<UserData> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<UserData> findByUserName(String username) {
        return Optional.empty();
    }

    @Override
    public Boolean IsTaskOwner(Long userId, Long taskId) {
        return false;
    }
}
