package algokelvin.springboot.java.demo.wizardmakmur.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class HistoryTransaction {
    String id;
    String date;
    Integer price;
    Boolean status;
}
