package com.example.demo.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * @author msermpezis-dev
 * @project demo
 * @created 11:25 π.μ. - 24/07/2022
 */
@Service
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String email) {

        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pattern = Pattern.compile(regex);

        if (patternMatches(email,regex)) {
            return true;
        }
        return false;

    }

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }
}
