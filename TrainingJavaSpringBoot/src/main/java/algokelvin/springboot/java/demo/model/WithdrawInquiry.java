package algokelvin.springboot.java.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class WithdrawInquiry {
    Integer userId;
    String email;
    Integer amountTransfer;
    String custRefNumber;
    String purpose;
    String timestamp;
    String  signature;
}
