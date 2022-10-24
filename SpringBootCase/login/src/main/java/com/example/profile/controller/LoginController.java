package com.example.profile.controller;

import com.example.profile.config.GlobalApiResponse;
import com.example.profile.dto.login.LoginDeviceRequest;
import com.example.profile.dto.auth.MentahanReference;
import com.example.profile.dto.auth.ModelRegisterkey;
import com.example.profile.service.LoginService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        path = "/profile/login",
        produces = MediaType.APPLICATION_JSON_VALUE
)
@Validated
@Api(tags = "Configuration")
@Slf4j
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping(
            value = "register-key",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses(value = {
            @ApiResponse(
                    code = 200,
                    message = "successful operation",
                    response = GlobalApiResponse.class)
    }) public GlobalApiResponse<?> registerKey(
            @RequestBody ModelRegisterkey request
    ) {
        return new GlobalApiResponse<>(
                HttpStatus.OK.value(),
                loginService.registerKeySvc(request)
        );
    }

    @PostMapping(
            value = "download-data",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses(value = {
            @ApiResponse(
                    code = 200,
                    message = "successful operation",
                    response = GlobalApiResponse.class)
    }) public GlobalApiResponse<?> downloadData(
            @RequestBody LoginDeviceRequest request
    ) {
        return new GlobalApiResponse<>(
                HttpStatus.OK.value(),
                loginService.downloadDataSvc(request)
        );
    }

    @PostMapping(
            value = "logon",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses(value = {
            @ApiResponse(
                    code = 200,
                    message = "successful operation",
                    response = GlobalApiResponse.class)
    }) public GlobalApiResponse<?> logon(
            @RequestBody MentahanReference request
    ) {
        return new GlobalApiResponse<>(
                HttpStatus.OK.value(),
                loginService.downloadKeySvc(request)
        );
    }

}
