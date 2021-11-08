package algokelvin.springboot.java.demo.wizardmakmur.endpoint;

import algokelvin.springboot.java.demo.wizardmakmur.model.ReqReprint;
import algokelvin.springboot.java.demo.wizardmakmur.model.ReqReprintAnyTrans;
import algokelvin.springboot.java.demo.wizardmakmur.model.RespReprint;
import algokelvin.springboot.java.demo.wizardmakmur.model.ResponseData;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostAnyTransactions {
    @PostMapping(value = "/v1/reprint/anytransactions", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RespReprint> responseMessage(@RequestBody ReqReprintAnyTrans reqReprint) {

        RespReprint respReprint;
        String username = reqReprint.getUsername();
        int terminalKey = reqReprint.getTerminal_key();
        int merchantKey = reqReprint.getMerchant_key();
        String reprintType = reqReprint.getReprint_type();

        if (username.equals("merchant1") && terminalKey == 1 && merchantKey == 1) {
            if (reprintType.equals("ANY")) {
                String detail = "040710010734108100000014215100009000089098140422031206093215130804152021371224070982818838067524666206000037BN0600000202144556****34022203051";
                ResponseData responseData = new ResponseData("00000", "00", detail);
                respReprint = new RespReprint(responseData, "SUCCESS", "true");
                return new ResponseEntity(respReprint, HttpStatus.OK);
            } else if (reprintType.equals("ANY")) {

            }
        } else {
            return new ResponseEntity(null, HttpStatus.OK);
        }
        return new ResponseEntity(null, HttpStatus.NOT_FOUND);
    }
}
