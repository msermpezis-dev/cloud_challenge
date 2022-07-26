package com.example.demo.appuser;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * @author msermpezis-dev
 * @project demo
 */

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class AppUserRequest {
    private final String email;
}