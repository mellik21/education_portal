package com.github.mellik21.education.controller;

import com.github.mellik21.education.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @GetMapping("/ok")
    public String ok(){
        return "ok";
    }


}
