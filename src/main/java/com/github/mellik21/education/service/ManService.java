package com.github.mellik21.education.service;

import com.github.mellik21.education.repository.ManRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManService {
    @Autowired
    private final ManRepository manRepository;
}
