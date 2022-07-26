package com.example.demo.appointment;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;

/**
 * @author msermpezis-dev
 * @project demo
 */

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long user_id;

    @Column(nullable = false)
    private Long consultation_id;

    @Column(nullable = false)
    private int duration;

    @Column(nullable = false)
    private LocalDateTime appointment_time;

    @Column(nullable = false)
    private LocalDateTime created_time;
}
