package com.shotaroi.springboottodolistapp.controller;

import com.shotaroi.springboottodolistapp.model.ToDo;
import com.shotaroi.springboottodolistapp.service.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ToDoController {
    private final ToDoService toDoService;

    @GetMapping("/todos")
    public String getTodos() {
        return "List of Todos";
    }

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/")
    public String listToDos(Model model) {
//        model.addAttribute("todos", toDoService.getAllToDos());
        return "index";
    }

    @PostMapping("/add")
    public String addToDo(@ModelAttribute ToDo toDo) {
        toDoService.saveToDo(toDo);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteToDo(@PathVariable Long id) {
        toDoService.deleteToDoById(id);
        return "redirect:/";
    }
}
