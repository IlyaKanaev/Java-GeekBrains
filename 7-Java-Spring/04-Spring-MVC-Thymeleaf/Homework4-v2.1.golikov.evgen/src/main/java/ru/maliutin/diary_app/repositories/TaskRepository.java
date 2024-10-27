package ru.maliutin.diary_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maliutin.diary_app.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}