package com.angel.utils;

import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpServletRequest;

public class ObtainIpAddress {

    @Autowired
    private HttpServletRequest request;

    public String getIpAddress() {
        String ipAddress = request.getHeader("X-FORWARDED-FO");
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        return ipAddress;
    }
}
