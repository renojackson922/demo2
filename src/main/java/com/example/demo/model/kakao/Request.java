package com.example.demo.model.kakao;

import org.springframework.beans.factory.annotation.Qualifier;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Qualifier("KakaoRequest")

@JsonIgnoreProperties(ignoreUnknown = true)
public class Request {

    private String client_id;
    private String return_uri;
    private String response_type;
    private String state;
    private String auth_type;

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getReturn_uri() {
        return return_uri;
    }

    public void setReturn_uri(String return_uri) {
        this.return_uri = return_uri;
    }

    public String getResponse_type() {
        return response_type;
    }

    public void setResponse_type(String response_type) {
        this.response_type = response_type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAuth_type() {
        return auth_type;
    }

    public void setAuth_type(String auth_type) {
        this.auth_type = auth_type;
    }
}
