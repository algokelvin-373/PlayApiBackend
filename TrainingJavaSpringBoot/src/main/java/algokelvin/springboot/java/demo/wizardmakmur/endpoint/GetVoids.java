package algokelvin.springboot.java.demo.wizardmakmur.endpoint;

import algokelvin.springboot.java.demo.wizardmakmur.model.Voids;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetVoids {
    @GetMapping(value = "/tsm/voids/{idVoids}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Voids> responseMessage(@PathVariable(value="idVoids") Integer idVoid) {

        Voids voids = null;
        if (idVoid == 12345) {
            voids = new Voids(12345, "460612343371", "24 Feb 2021", "13:02:41", 30000);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(voids, HttpStatus.OK);
    }
}
