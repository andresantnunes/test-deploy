package com.example.demoaula.service;

import com.example.demoaula.dataprovider.Task;
import com.example.demoaula.dataprovider.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private static final Logger logger = LoggerFactory.getLogger(TaskService.class);

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        logger.debug("Buscando todas as tarefas");
        return taskRepository.findByConcluida(false);
    }

    public void createTask(Task task) {
        taskRepository.save(task);
    }
}
