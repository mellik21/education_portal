package com.github.mellik21.education.controller;

import com.github.mellik21.education.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController("/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    /* TODO
    @GetMapping("/get")
    @PostMapping("/create")
    @PostMapping("/save")
    @RequestMapping("/search")
    */

}
