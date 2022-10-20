package com.example.profile.dto.login;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginResponse {
    String merchant_name;
    String terminal_code;
    String merchant_code;
    String merchant_addr1;
    String merchant_addr2;
    String merchant_addr3;
    Long terminal_key;
    Long merchant_key;
    String token;
}