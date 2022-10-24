package com.example.profile.dto.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class MentahanReference {

    @NotNull
    @JsonProperty("terminal_key")
    private Long terminalKey;

    @NotNull
    @JsonProperty("merchant_key")
    private Long merchantKey;

}
