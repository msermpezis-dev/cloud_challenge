package com.example.demo.consultation;

import com.example.demo.email.IEmailSender;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;


/**
 * @author msermpezis-dev
 * @project demo
 * @created 8:19 μ.μ. - 24/07/2022
 */
@RestController
@RequestMapping("/api/v1/consultations")
@RequiredArgsConstructor
public class ConsultationController {

    @Autowired
    IConsultationRepository consultationRepository;
    private final ConsultationService consultationService;


    @GetMapping("/all")
    public List<Consultation> getAll(){
        return consultationRepository.findAll();
    }

    @PostMapping("/add")
    public String addConsultation(@RequestBody ConsultationRequest request){
        return consultationService.saveConsultation(request);
    }

}
