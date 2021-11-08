package algokelvin.springboot.java.demo.wizardmakmur.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Settlement {
    Integer total_credit;
    Integer amount_credit;
    Integer total_debit;
    Integer amount_debit;
}
