package com.github.mellik21.education.service;

import com.github.mellik21.education.repository.ManRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManService {
    private final ManRepository manRepository;
}
