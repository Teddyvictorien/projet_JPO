package projet_jpo.back.controllers;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import projet_jpo.back.services.ToDoListService;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Controller
public class ToDoListController {
    @Autowired
    private ToDoListService toDoListService;

    /**
     * Read - Get all employees
     *
     * @return - An Iterable object of Employee full filled
     */
    @GetMapping("/getAll")
    public Iterable<CollectionReference> getAllToDoList() throws IOException, ExecutionException, InterruptedException {

        return toDoListService.getAllToDoList();
    }

    public List<QueryDocumentSnapshot> getTodolistContent(String todolistName) throws IOException, ExecutionException, InterruptedException {
        return toDoListService.getToDoListContent(todolistName);
    }

}
