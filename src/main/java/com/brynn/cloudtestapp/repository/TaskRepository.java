package com.brynn.cloudtestapp.repository;

import com.brynn.cloudtestapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}