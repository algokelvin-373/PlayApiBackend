package algokelvin.app.profile.userprofile.services;

import algokelvin.app.profile.userprofile.config.CustomException;
import algokelvin.app.profile.userprofile.dto.people.People;
import algokelvin.app.profile.userprofile.dto.people.RspPeople;
import algokelvin.app.profile.userprofile.httpservices.PeopleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PeopleServicesImpl implements PeopleServices {

    @Autowired
    private PeopleRepository peopleRepository;

    private final Logger LOG = LoggerFactory.getLogger(PeopleServicesImpl.class);

    @Override
    public RspPeople getProfile(int id) {
        People people;
        try {
            Optional<People> config = peopleRepository.findById(id);
            if (config.isEmpty()) {
                throw new CustomException("Data User Not Found", HttpStatus.NOT_FOUND);
            }
            people = config.get();
        } catch (Exception e) {
            e.printStackTrace();
            throw new CustomException("Invalid Error", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return RspPeople.builder()
                .name(people.getName())
                .address(people.getAddress())
                .description(people.getDescription())
                .build();
    }
}
