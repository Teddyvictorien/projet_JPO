package projet_jpo.back.services;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projet_jpo.back.repositories.ToDoListRepository;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class ToDoListService {
    @Autowired
    private ToDoListRepository toDoListRepository;
    public Iterable<CollectionReference> getAllToDoList() throws IOException, ExecutionException, InterruptedException {
        return toDoListRepository.getAllToDoList();
    }

    public List<QueryDocumentSnapshot> getToDoListContent(String todolistName) throws IOException, ExecutionException, InterruptedException {
        return toDoListRepository.getTodolistContent(todolistName);
    }
}
