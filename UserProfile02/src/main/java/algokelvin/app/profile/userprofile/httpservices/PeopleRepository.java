package algokelvin.app.profile.userprofile.httpservices;

import algokelvin.app.profile.userprofile.dto.people.People;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface PeopleRepository extends CrudRepository<People, Integer> {
    @Transactional
    @Modifying
    @Query("update People e set e.name = ?1, e.address = ?2, e.description = ?3 where e.id = ?4")
    int updateUserById(String name, String address, String description, Integer userId);
}