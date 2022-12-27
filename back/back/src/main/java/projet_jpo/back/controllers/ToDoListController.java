package projet_jpo.back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import projet_jpo.back.services.ToDoListService;

public class ToDoListController {
    @Autowired
    private ToDoListService toDoListService;

    /**
     * Read - Get all employees
     * @return - An Iterable object of Employee full filled
     */
    @GetMapping("/")
    public String getAllToDoList() {
        return toDoListService.getAllToDoList();
    }
}
