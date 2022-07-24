package com.example.demo.appointment;

import java.util.List;

/**
 * @author msermpezis-dev
 * @project demo
 * @created 3:43 μ.μ. - 24/07/2022
 */
public interface IAppointmentService {
    Appointment saveAppointment(Appointment appointment);

    void deleteAppointment(Long id);

    List<Appointment> findAllAppointments();
}
