package ru.sergalas.taskTraker.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.sergalas.taskTraker.domains.user.User;
import ru.sergalas.taskTraker.repositories.dao.UserDao;
import ru.sergalas.taskTraker.repositories.jpa.UserRepository;
import ru.sergalas.taskTraker.services.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;
    private final UserRepository userRepository;


    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User getByUsername() {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public Boolean isTaskOwner(Long userId, Long taskId) {
        return null;
    }

    @Override
    public void delete(User user) {

    }
}
