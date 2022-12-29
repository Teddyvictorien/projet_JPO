package projet_jpo.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import projet_jpo.back.firestore_config.Config;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;


@SpringBootApplication
public class BackApplication {

	public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
		SpringApplication.run(BackApplication.class, args);
        Config Conf = new Config();
        Conf.InsertFirebase();

	}
}
