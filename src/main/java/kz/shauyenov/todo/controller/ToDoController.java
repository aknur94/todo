package kz.shauyenov.todo.controller;

import kz.shauyenov.todo.entity.ToDo;
import kz.shauyenov.todo.service.ToDoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/{id}")
    public ToDo getToDoById(@PathVariable("id") Long id) {
        return toDoService.getToDoById(id);
    }

    @GetMapping("")
    public List<ToDo> getAllToDos() {
        return toDoService.getAllToDos();
    }

    @PostMapping("/create")
    public ToDo createToDo(@RequestBody ToDo toDo) {
        return toDoService.createToDo(toDo);
    }

    @PostMapping("/do/{id}")
    public ToDo doToDo(@PathVariable("id") Long id) {
        return toDoService.doToDo(id);
    }

    @PostMapping("/redo/{id}")
    public ToDo redoToDo(@PathVariable("id") Long id) {
        return toDoService.undoToDo(id);
    }

    @DeleteMapping("/{id}")
    public void deleteToDo(@PathVariable("id") Long id) {
        toDoService.deleteToDo(id);
    }
}