package com.example.profile.service;

import com.example.profile.dto.auth.DataRegKey;
import com.example.profile.dto.auth.LogonResponse;
import com.example.profile.dto.auth.MentahanReference;
import com.example.profile.dto.auth.ModelRegisterkey;
import com.example.profile.dto.login.LoginDeviceRequest;
import com.example.profile.dto.login.LoginResponse;

public interface LoginService {
    DataRegKey registerKeySvc(ModelRegisterkey request);
    LoginResponse downloadDataSvc(LoginDeviceRequest request);
    LogonResponse downloadKeySvc(MentahanReference request);
}
