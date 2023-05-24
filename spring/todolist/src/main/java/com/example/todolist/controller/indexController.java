package com.example.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.todolist.service.todoService;

@Controller
public class indexController {
    private final todoService todoservice;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("response", todoservice);
        return "index";
    }
}
