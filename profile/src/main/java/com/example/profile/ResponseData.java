package com.example.profile;

import java.util.Optional;

public class ResponseData {
    String message;
    boolean status;
    Optional<People> response_data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Optional<People> getResponse_data() {
        return response_data;
    }

    public void setResponse_data(Optional<People> response_data) {
        this.response_data = response_data;
    }
}
