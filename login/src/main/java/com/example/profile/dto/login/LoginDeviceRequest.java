package com.example.profile.dto.login;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class LoginDeviceRequest {

    @NotNull
    private String reference;

    @NotNull
    private String serial_number;

}
