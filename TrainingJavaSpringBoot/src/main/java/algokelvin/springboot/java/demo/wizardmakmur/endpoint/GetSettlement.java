package algokelvin.springboot.java.demo.wizardmakmur.endpoint;

import algokelvin.springboot.java.demo.wizardmakmur.model.DataKeys;
import algokelvin.springboot.java.demo.wizardmakmur.model.Settlement;
import algokelvin.springboot.java.demo.wizardmakmur.model.Voids;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetSettlement {
    @GetMapping(value = "/tsm/settlement", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Voids> responseMessage(@RequestBody DataKeys dataKeys) {

        Settlement settlement;
        if (dataKeys.getMerchant_key() == 1 && dataKeys.getTerminal_key() == 1) {
            settlement = new Settlement(30, 12000, 29, 13000);
        } else {
            return new ResponseEntity(null, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(settlement, HttpStatus.OK);
    }
}
