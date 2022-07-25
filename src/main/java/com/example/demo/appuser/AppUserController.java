package com.example.demo.appuser;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

import static java.util.Arrays.stream;

/**
 * @author msermpezis-dev
 * @project demo
 * @created 8:19 μ.μ. - 24/07/2022
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AppUserController {

    @Autowired
    IAppUserRepository appUserRepository;
    @Autowired
    AppUserService appUserService;

    @GetMapping("/refreshToken")
    public void refreshToken(HttpServletRequest request, HttpServletResponse response){
        // TODO finish refresh token call
    }
    @GetMapping("/users")
    public List<AppUser> getAll(){
        return appUserRepository.findAll();
    }

    @GetMapping("/users/{user_id}")
    public Optional<AppUser> getName(@PathVariable Long user_id, Authentication authentication) {

        String email = appUserService.getEmailFromAuthentication(authentication);
        Long id = Long.valueOf(appUserRepository.getAppUserIdByEmail(email));
        if (id == user_id){
            return appUserRepository.findById(id);
        }

        throw new IllegalStateException("Unauthorized get request");
    }

}
