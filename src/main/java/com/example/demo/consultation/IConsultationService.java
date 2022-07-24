package com.example.demo.consultation;

import java.util.List;

/**
 * @author msermpezis-dev
 * @project demo
 * @created 3:35 μ.μ. - 24/07/2022
 */
public interface IConsultationService {
    Consultation saveConsultation(Consultation consultation);

    void deleteConsultation(Long id);

    List<Consultation> findAllConsultations();
}
