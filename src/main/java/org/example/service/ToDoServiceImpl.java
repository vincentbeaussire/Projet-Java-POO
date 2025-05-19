package org.example.service;

import org.example.model.Todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoServiceImpl implements TodoService {
    private List<Todo> todos = new ArrayList<>();

    @Override
    public List<Todo> getAll() {
        return new ArrayList<>(todos);
    }

    @Override
    public Todo getById(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }

    @Override
    public void add(String name, String description) {
        Todo newTodo = new Todo(name, description);
        todos.add(newTodo);
        System.out.println("Nous avons ajouté la tâche : " + name + " et sa description : " + description);
    }

    @Override
    public void update(int id, String name, String description, boolean done) {
        Todo todo = getById(id);
        if (todo != null) {
            todo.setName(name);
            todo.setDescription(description);
            todo.setDone(done);
            System.out.println("L'identifiant " + id + " a été modifié de la façon suivante : " + name + " : " + description + " : " + done);
        }
    }

    @Override
    public void remove(int id) {
        Todo todo = getById(id);
        if (todo != null) {
            todos.remove(todo);
            System.out.println("Nous avons supprimé l'identifiant : " + id);
        }
    }

    @Override
    public void toggleDone(int id) {
        Todo todo = getById(id);
    }
}
