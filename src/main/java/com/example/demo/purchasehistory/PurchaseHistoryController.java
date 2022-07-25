package com.example.demo.purchasehistory;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.demo.consultation.Consultation;
import com.example.demo.consultation.IConsultationRepository;
import com.example.demo.purchasehistory.IPurchaseHistoryRepository;
import com.example.demo.purchasehistory.PurchaseHistory;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

import static java.util.Arrays.stream;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static org.springframework.http.HttpStatus.FORBIDDEN;

/**
 * @author msermpezis-dev
 * @project demo
 * @created 8:19 μ.μ. - 24/07/2022
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PurchaseHistoryController {

    @Autowired
    IPurchaseHistoryRepository purchaseHistoryRepository;


    @GetMapping("/purchases")
    public List<PurchaseHistory> getAll(){
        return purchaseHistoryRepository.findAll();
    }

}
