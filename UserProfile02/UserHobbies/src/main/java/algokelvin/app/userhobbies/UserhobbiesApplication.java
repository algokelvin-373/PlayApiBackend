package algokelvin.app.userhobbies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableScheduling
@RestController
public class UserhobbiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserhobbiesApplication.class, args);
	}

	@GetMapping("/")
	public String root() {
		return "Server userhobbies is running...";
	}

}
