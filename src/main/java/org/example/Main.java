package org.example;


import org.example.ihm.Ihm;
import org.example.service.ToDoServiceImpl;
import org.example.service.TodoService;


public class Main {
    public static void main(String[] args) {
        TodoService service = new ToDoServiceImpl(); // remplacer null par une instanciation d'une classe respectant l'interface TodoService
        Ihm ihm = new Ihm(service);
        ihm.start();
    }
}