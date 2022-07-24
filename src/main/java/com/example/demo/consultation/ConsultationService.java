package com.example.demo.consultation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ConsultationService implements IConsultationService{

    @Autowired
    private final IConsultationRepository consultationRepository;

    public ConsultationService(IConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Consultation saveConsultation(Consultation consultation){
        return consultationRepository.save(consultation);
    }

    @Override
    public void deleteConsultation(Long id){
        consultationRepository.deleteById(id);
    }

    @Override
    public List<Consultation> findAllConsultations(){
        return consultationRepository.findAll();
    }
}
