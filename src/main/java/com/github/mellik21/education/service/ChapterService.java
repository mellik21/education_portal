package com.github.mellik21.education.service;

import com.github.mellik21.education.repository.ChapterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChapterService {
    @Autowired
    private final ChapterRepository chapterRepository;

}
