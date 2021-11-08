package algokelvin.springboot.java.demo.wizardmakmur.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Acquirer {
    String name;
    Integer count;
    Integer amount;
    String batch_no;
}
