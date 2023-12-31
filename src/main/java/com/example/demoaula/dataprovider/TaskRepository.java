package com.example.demoaula.dataprovider;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByConcluida(boolean concluida);
}
