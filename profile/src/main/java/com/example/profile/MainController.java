package com.example.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/*
Reference:
https://www.javatpoint.com/spring-boot-crud-operations
https://self-learning-java-tutorial.blogspot.com/2021/04/spring-data-jpa-update-entity-using.html
 */

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private PeopleRepository peopleRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody Optional<People> addNewUser(@RequestBody People p) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        People people = new People();
//        people.setId(id);
        people.setName(p.name);
        people.setAddress(p.address);
        people.setDescription(p.description);
        peopleRepository.save(people);
        return peopleRepository.findById(people.id);
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<People> getAllUsers() {
        // This returns a JSON or XML with the users
        return peopleRepository.findAll();
    }

    @GetMapping(path = "/profile/{id}")
    @ResponseBody
    public ResponseEntity<ResponseData> getUserById(@PathVariable int id) {
        ResponseData responseData = new ResponseData();
        Optional<People> people = peopleRepository.findById(id);
        System.out.println(people);
        if (people.isEmpty()) {
            responseData.setMessage("Data User Not Found");
            responseData.setStatus(false);
        } else {
            responseData.setMessage("Data User is Founded");
            responseData.setStatus(true);
        }
        responseData.setResponse_data(people);
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @PostMapping(path = "/delete")
    public @ResponseBody void deleteUserById(@RequestParam int id) {
        peopleRepository.deleteById(id);
    }

    @PutMapping(path = "/update/{id}")
    public @ResponseBody Optional<People> updateUser(@PathVariable int id, @RequestBody People p) {
        peopleRepository.updateUserById(p.name, p.address, p.description, id);
        return peopleRepository.findById(id);
    }

}
