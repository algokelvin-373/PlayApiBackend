package algokelvin.springboot.java.demo.wizardmakmur.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReqReprint {
    String username;
    Integer terminal_key;
    Integer merchant_key;
    String reprint_type;
}
