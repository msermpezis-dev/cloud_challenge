package com.example.demo.appuser;

import com.example.demo.appuser.AppUserRole;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * @author msermpezis-dev
 * @project demo
 * @created 12:26 π.μ. - 24/07/2022
 */
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class AppUserRequest {

    private final String email;
    private final String password;
}
