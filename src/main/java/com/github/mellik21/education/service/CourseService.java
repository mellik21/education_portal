package com.github.mellik21.education.service;

import com.github.mellik21.education.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {
    @Autowired
    private final CourseRepository courseRepository;
}
