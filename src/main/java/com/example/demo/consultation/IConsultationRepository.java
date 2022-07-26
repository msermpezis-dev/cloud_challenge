package com.example.demo.consultation;


import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author msermpezis-dev
 * @project demo
 */

public interface IConsultationRepository extends JpaRepository<Consultation, Long> {

}
