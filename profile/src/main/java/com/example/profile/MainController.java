package com.example.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private PeopleRepository peopleRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser(@RequestBody People p) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        People people = new People();
//        people.setId(id);
        people.setName(p.name);
        people.setAddress(p.address);
        people.setDescription(p.description);
        peopleRepository.save(people);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<People> getAllUsers() {
        // This returns a JSON or XML with the users
        return peopleRepository.findAll();
    }

    @GetMapping(path = "/profile/{id}")
    public @ResponseBody
    Optional<People> getUserById(@PathVariable int id) {
        return peopleRepository.findById(id);
    }

    @PostMapping(path = "/delete")
    public @ResponseBody void deleteUserById(@RequestParam int id) {
        peopleRepository.deleteById(id);
    }

}
