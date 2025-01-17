package com.shotaroi.springboottodoapp.controller;

import com.shotaroi.springboottodoapp.model.ToDo;
import com.shotaroi.springboottodoapp.service.ToDoService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ToDoController {
    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/")
    public String listToDos(Model model) {
        model.addAttribute("todos", toDoService.getAllToDos());
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
