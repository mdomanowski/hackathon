package pl.hackathon.knowx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.hackathon.knowx.model.entities.Flashcard;

@SpringBootApplication
public class KnowxApplication {
	public static void main(String[] args) {
		SpringApplication.run(KnowxApplication.class, args);
	}
}
