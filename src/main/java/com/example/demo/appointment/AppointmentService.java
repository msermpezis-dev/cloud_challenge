package com.example.demo.appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author msermpezis-dev
 * @project demo
 * @created 3:44 μ.μ. - 24/07/2022
 */
@Service
public class AppointmentService implements IAppointmentService{

    @Autowired
    private final IAppointmentRepository appointmentRepository;

    public AppointmentService(IAppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Appointment saveAppointment(Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    @Override
    public void deleteAppointment(Long id){
        appointmentRepository.deleteById(id);
    }

    @Override
    public List<Appointment> findAllAppointments(){
        return appointmentRepository.findAll();
    }
}
