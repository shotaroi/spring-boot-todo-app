package com.shotaroi.springboottodoapp.repository;

import com.shotaroi.springboottodoapp.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<Todo, Long> {
}
