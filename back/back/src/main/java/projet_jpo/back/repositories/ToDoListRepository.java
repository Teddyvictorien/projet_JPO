package projet_jpo.back.repositories;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.*;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class ToDoListRepository {
    protected List<QueryDocumentSnapshot> getAllToDoList() throws IOException, ExecutionException, InterruptedException {

        InputStream serviceAccount = new FileInputStream("projet-jpo-firebase-adminsdk-85z1d-1f1498429f(1).json");
        GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(credentials)
                .build();
        FirebaseApp.initializeApp(options);

        Firestore db = FirestoreClient.getFirestore();

        // asynchronously retrieve all documents
        ApiFuture<QuerySnapshot> future = db.collection("todolist").get();
// future.get() blocks on response
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();
        return documents;

    }

    protected List<QueryDocumentSnapshot> getTodolist(String name) throws IOException, ExecutionException, InterruptedException
    {
        InputStream serviceAccount = new FileInputStream("projet-jpo-firebase-adminsdk-85z1d-1f1498429f(1).json");
        GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(credentials)
                .build();
        FirebaseApp.initializeApp(options);

        Firestore db = FirestoreClient.getFirestore();

        // asynchronously retrieve multiple documents
        ApiFuture<QuerySnapshot> future = db.collection("todolist").whereEqualTo("titre", name).get();
// future.get() blocks on response
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();

        return documents;
    }
}
