package com.tbank.controller;

import com.tbank.config.ApplicationContext;
import com.tbank.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RESET = "\u001B[0m";

    @GetMapping("/")
    public String hello(Model model) {

        TaskService taskService = ApplicationContext.getBean(TaskService.class);
        model.addAttribute("tasks", taskService.getTasks());

        System.out.println(ANSI_YELLOW + taskService.getTasks() + ANSI_RESET);

        return "index";
    }

}