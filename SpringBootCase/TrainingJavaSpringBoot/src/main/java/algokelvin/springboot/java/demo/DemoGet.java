package algokelvin.springboot.java.demo;

import algokelvin.springboot.java.demo.model.Results;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoGet {

    //Using GetMapping for GET API
    @GetMapping(value = "/algokelvin/message", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Results> responseMessage() {

        Results results = new Results(200, "Success Call API Get");

        return new ResponseEntity<>(results, HttpStatus.OK);
    }
}
