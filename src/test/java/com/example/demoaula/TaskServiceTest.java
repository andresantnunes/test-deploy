package com.example.demoaula;

import com.example.demoaula.dataprovider.Task;
import com.example.demoaula.dataprovider.TaskRepository;
import com.example.demoaula.service.TaskService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TaskServiceTest {

    @InjectMocks
    private TaskService taskService;

    @Mock
    private TaskRepository taskRepository;


    @Test
    public void testGetAllTasks() {
        // Configuração de dados fictícios
        List<Task> mockTasks = Arrays.asList(new Task(), new Task());
        Mockito.when(taskRepository.findByConcluida(false)).thenReturn(mockTasks);

        // Execução do método sob teste
        List<Task> tasks = taskService.getAllTasks();

        // Verificações
        assertEquals(2, tasks.size());
    }
}
