package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.TaskRepository;
import com.gestion_hopital.services.interfaces.TaskInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskServices implements TaskInterfaces {
    private final TaskRepository taskRepository;
}
