package projet_jpo.back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import projet_jpo.back.services.ToDoListService;

import java.util.HashMap;

@Controller
public class ToDoListController {
    @Autowired
    private ToDoListService toDoListService;

    /**
     * Read - Get all employees
     * @return - An Iterable object of Employee full filled
     */
    @GetMapping("/getAll")
    public String getAllToDoList() {
        return toDoListService.getAllToDoList();
    }

}
