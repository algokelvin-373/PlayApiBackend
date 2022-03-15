package algokelvin.app.profile.userprofile;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableScheduling
@RestController
public class UserprofileApplication {

	public static void main(String[] args) {
		run(UserprofileApplication.class, args);
	}

	@GetMapping("/")
	public String root() {
		return "Server profile is running...";
	}

}
