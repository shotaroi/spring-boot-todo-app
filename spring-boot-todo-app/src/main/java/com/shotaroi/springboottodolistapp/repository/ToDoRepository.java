package com.shotaroi.springboottodolistapp.repository;

import com.shotaroi.springboottodolistapp.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
