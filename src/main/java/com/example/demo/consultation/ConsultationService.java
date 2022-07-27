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
    public String saveConsultation(ConsultationRequest request){
        String title = request.getTitle();
        Long consultation_id = Long.valueOf(consultationRepository.findByTitle(title));
        if (consultation_id != null) {
            throw new IllegalStateException("FAILED: title exists");
        }
        consultationRepository.save(
        new Consultation(
                title,
                request.getDescription(),
                request.getPrice()
        )
        );
        return "consultation added";
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
