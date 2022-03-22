package algokelvin.app.profile.userprofile;

import algokelvin.app.profile.userprofile.dto.people.People;
import algokelvin.app.profile.userprofile.dto.people.RspPeople;
import algokelvin.app.profile.userprofile.services.PeopleServices;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserprofileApplicationTests {

	@Autowired
	PeopleServices peopleServices;

	@Test
	void testGetProfile() {
		RspPeople people = peopleServices.getProfile(30);
		System.out.println("Name        => " + people.getName());
		System.out.println("Address     => " + people.getAddress());
		System.out.println("Description => " + people.getDescription());
	}

	@Test
	void testGetAllProfile() {
		Iterable<People> people = peopleServices.getAllProfile();
		people.forEach(dt -> {
			System.out.println("Name        => " + dt.getName());
			System.out.println("Address     => " + dt.getAddress());
			System.out.println("Description => " + dt.getDescription());
		});
	}

}
