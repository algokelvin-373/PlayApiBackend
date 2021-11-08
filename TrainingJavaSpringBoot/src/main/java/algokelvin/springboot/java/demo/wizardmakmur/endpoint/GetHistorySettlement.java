package algokelvin.springboot.java.demo.wizardmakmur.endpoint;

import algokelvin.springboot.java.demo.wizardmakmur.model.Acquirer;
import algokelvin.springboot.java.demo.wizardmakmur.model.HistorySettlement;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GetHistorySettlement {
    @PostMapping(value = "/tsm/historysettlement", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HistorySettlement> responseMessage() {

        ArrayList<HistorySettlement> historySettlements = new ArrayList<>();

        ArrayList<Acquirer> acquirers = new ArrayList<>();
        acquirers.add(new Acquirer("CREDIT", 30, 300123, "000001"));
        acquirers.add(new Acquirer("DEBIT", 646, 245600000, "000001"));
        historySettlements.add(new HistorySettlement("SETTL001", "20/8/2020 21:34", true, 676, 245900123, acquirers));

        ArrayList<Acquirer> acquirer02 = new ArrayList<>();
        acquirer02.add(new Acquirer("CREDIT", 30, 300123, "000001"));
        acquirer02.add(new Acquirer("DEBIT", 646, 245600000, "000001"));
        historySettlements.add(new HistorySettlement("SETTL001", "20/8/2020 21:34", true, 676, 245900123, acquirer02));

        ArrayList<Acquirer> acquirers03 = new ArrayList<>();
        acquirers03.add(new Acquirer("CREDIT", 30, 300123, "000001"));
        acquirers03.add(new Acquirer("DEBIT", 646, 245600000, "000001"));
        historySettlements.add(new HistorySettlement("SETTL001", "19/8/2020 21:34", true, 676, 245900123, acquirers03));

        ArrayList<Acquirer> acquirers04 = new ArrayList<>();
        acquirers04.add(new Acquirer("CREDIT", 30, 300123, "000001"));
        acquirers04.add(new Acquirer("DEBIT", 646, 245600000, "000001"));
        historySettlements.add(new HistorySettlement("SETTL001", "19/8/2020 21:34", true, 676, 245900123, acquirers04));


        return new ResponseEntity(historySettlements, HttpStatus.OK);
    }
}
