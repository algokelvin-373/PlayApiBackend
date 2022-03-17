package algokelvin.app.userhobbies;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableScheduling
@RestController
public class UserhobbiesApplication {

	public static void main(String[] args) {
		run(UserhobbiesApplication.class, args);
	}

	@GetMapping("/")
	public String root() {
		return "Server userhobbies is running...";
	}

}
