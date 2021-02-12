package kz.shauyenov.todo.service;

import kz.shauyenov.todo.entity.ToDo;
import kz.shauyenov.todo.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    final ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public ToDo getToDoById(Long id) {
        return toDoRepository.findById(id).get();
    }

    public List<ToDo> getAllToDos() {
        return toDoRepository.findAll();
    }

    public ToDo createToDo(ToDo toDo) {
        return toDoRepository.save(toDo);
    }

    public ToDo doToDo(Long id) {
        ToDo toDo = toDoRepository.findById(id).get();
        toDo.setDone(true);
        return toDoRepository.save(toDo);
    }

    public void deleteToDo(Long id) {
        ToDo toDo = toDoRepository.findById(id).get();
        toDoRepository.delete(toDo);
    }

    public ToDo undoToDo(Long id) {
        ToDo toDo = toDoRepository.findById(id).get();
        toDo.setDone(false);
        return toDoRepository.save(toDo);
    }

    public ToDo changeTitle(Long id, String title) {
        ToDo toDo = toDoRepository.findById(id).get();
        toDo.setTitle(title);
        return toDoRepository.save(toDo);
    }
}