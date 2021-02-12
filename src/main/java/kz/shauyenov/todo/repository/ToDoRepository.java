package kz.shauyenov.todo.repository;

import kz.shauyenov.todo.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}