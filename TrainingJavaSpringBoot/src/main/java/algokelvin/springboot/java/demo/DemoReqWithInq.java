package algokelvin.springboot.java.demo;

import algokelvin.springboot.java.demo.model.Results;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoReqWithInq {
    //Using PostMapping for POST API
    @PostMapping(value = "/withdraw/inquiry", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Results> responseMessage() {

        Results results = new Results(200, "Success Call API POST");

        return new ResponseEntity<>(results, HttpStatus.OK);
    }
}
