package com.example.demo.registration;

import org.springframework.stereotype.Service;

/**
 * @author msermpezis-dev
 * @project demo
 * @created 12:25 π.μ. - 24/07/2022
 */
@Service
public class RegistrationService {
    public String register(RegistrationRequest request) {
        return "works";
    }
}
