package com.shotaroi.springboottodoapp.service;

import com.shotaroi.springboottodoapp.repository.ToDoRepository;
import com.shotaroi.springboottodoapp.model.ToDo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ToDoService {
    private final ToDoRepository toDoRepository;
    public List<ToDo> getAllToDos() {
        return toDoRepository.findAll();
    }

    public ToDo saveToDo(ToDo toDo) {
        return toDoRepository.save(toDo);
    }

    public void deleteToDoById(Long id) {
        toDoRepository.deleteById(id);
    }
}
