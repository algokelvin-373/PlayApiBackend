package algokelvin.springboot.java.demo.wizardmakmur.endpoint;

import algokelvin.springboot.java.demo.model.Results;
import algokelvin.springboot.java.demo.wizardmakmur.model.HistoryTransaction;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GetHistoryTransaction {
    @GetMapping(value = "/tsm/historytransaction", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HistoryTransaction> responseMessage() {

        ArrayList<HistoryTransaction> historyTransactionArrayList = new ArrayList<>();
        historyTransactionArrayList.add(new HistoryTransaction("INV009", "20/08/20 21:34", 22000, true));
        historyTransactionArrayList.add(new HistoryTransaction("INV009", "20/08/20 21:34", 22000, true));
        historyTransactionArrayList.add(new HistoryTransaction("INV009", "20/08/20 21:34", 22000, true));
        historyTransactionArrayList.add(new HistoryTransaction("INV009", "20/08/20 21:34", 22000, true));
        historyTransactionArrayList.add(new HistoryTransaction("INV009", "19/08/20 21:34", 22000, true));
        historyTransactionArrayList.add(new HistoryTransaction("INV009", "19/08/20 21:34", 22000, true));
        historyTransactionArrayList.add(new HistoryTransaction("INV009", "19/08/20 21:34", 22000, true));
        historyTransactionArrayList.add(new HistoryTransaction("INV009", "19/08/20 21:34", 22000, true));
        historyTransactionArrayList.add(new HistoryTransaction("INV009", "18/08/20 21:34", 22000, true));

        return new ResponseEntity(historyTransactionArrayList, HttpStatus.OK);
    }
}
