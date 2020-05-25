package com.bit.security.domain;

import lombok.Data;

@Data
public class Authority {

    private String userName;
    private String authorityName;

    @Override
    public String toString() {
        return "Authority [userName=" + userName + ", authorityName=" + authorityName + "]";
    }

}