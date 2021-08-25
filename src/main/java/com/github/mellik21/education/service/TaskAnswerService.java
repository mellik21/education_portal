package com.github.mellik21.education.service;

import com.github.mellik21.education.repository.TaskAnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskAnswerService {
    private final TaskAnswerRepository taskAnswerRepository;
}
