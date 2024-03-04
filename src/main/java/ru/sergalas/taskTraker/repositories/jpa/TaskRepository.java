package ru.sergalas.taskTraker.repositories.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sergalas.taskTraker.domains.task.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
