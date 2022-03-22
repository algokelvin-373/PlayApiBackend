package algokelvin.app.profile.userprofile;

import algokelvin.app.profile.userprofile.config.GlobalApiResponse;
import algokelvin.app.profile.userprofile.dto.people.People;
import algokelvin.app.profile.userprofile.dto.people.RspPeople;
import algokelvin.app.profile.userprofile.services.PeopleServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

@SpringBootTest
class PeopleServiceTest {

	@Autowired
	PeopleServices peopleServices;

	@Test
	void testGetProfile() {
		GlobalApiResponse<RspPeople> response = new GlobalApiResponse<>(
				HttpStatus.OK.value(),
				peopleServices.getProfile(30)
		);
		System.out.println("Status => "+ response.getStatus());
		System.out.println("Data:");
		System.out.println("Name        => " + response.getData().getName());
		System.out.println("Address     => " + response.getData().getAddress());
		System.out.println("Description => " + response.getData().getDescription());
	}

	@Test
	void testGetAllProfile() {
		GlobalApiResponse<Iterable<People>> response = new GlobalApiResponse<>(
				HttpStatus.OK.value(),
				peopleServices.getAllProfile()
		);
		System.out.println("Status => "+ response.getStatus());
		response.getData().forEach(dt -> {
			System.out.println("Name        => " + dt.getName());
			System.out.println("Address     => " + dt.getAddress());
			System.out.println("Description => " + dt.getDescription());
		});
	}

}
