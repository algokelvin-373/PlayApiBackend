package algokelvin.springboot.java.demo.wizardmakmur.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HistorySettlement {
     String settle_id;
     String datetime;
     Boolean status;
     Integer total_transaction;
     Integer total_amount;
     ArrayList<Acquirer> detail_acquirer;
}
