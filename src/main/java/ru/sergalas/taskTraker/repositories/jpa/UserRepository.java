package ru.sergalas.taskTraker.repositories.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sergalas.taskTraker.domains.user.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
