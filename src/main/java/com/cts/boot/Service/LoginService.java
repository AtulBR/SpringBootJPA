package com.cts.boot.Service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean validateUser(String id, String password) {
        return id.equalsIgnoreCase("atul.k@pwc.com") && password.equalsIgnoreCase("12345678");
    }
}
