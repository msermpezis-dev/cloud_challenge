package com.example.demo.consultation;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author msermpezis-dev
 * @project demo
 */

public interface IConsultationRepository extends JpaRepository<Consultation, Long> {

    @Transactional
    @Query("SELECT id " +
            "FROM Consultation " +
            "WHERE title = ?1")
    int findByTitle(String title);

}
