package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.TaskInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/task/")
@RequiredArgsConstructor
public class TaskApi {
    private final TaskInterfaces taskInterfaces;
}
