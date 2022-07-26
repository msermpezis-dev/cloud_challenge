package com.example.demo.appointment;

import com.example.demo.appuser.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author msermpezis-dev
 * @project demo
 */


@Repository
@Transactional(readOnly = true)
public interface IAppointmentRepository extends JpaRepository<Appointment, Long> {

}
