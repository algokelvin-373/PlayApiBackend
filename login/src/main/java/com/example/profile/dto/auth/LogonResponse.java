package com.example.profile.dto.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LogonResponse {

    @NotNull
    @JsonProperty("aes_wk")
    private String aes_wk;

    @NotNull
    @JsonProperty("iv_wk")
    private String iv_wk;

    @NotNull
    @JsonProperty("key_expired")
    private String key_expired;

    @NotNull
    @JsonProperty("token")
    private String token;
}
