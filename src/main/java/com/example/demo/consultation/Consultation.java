package com.example.demo.consultation;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class Consultation {

    @Id
    @SequenceGenerator(
            name = "consultation_sequence",
            sequenceName = "consultation_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "consultation_sequence"
    )
    private Long id;

    @Column(nullable = false,length = 100)
    private String title;

    @Column(nullable = false,length = 1000)
    private String description;

    @Column(nullable = false,length = 100)
    private String price;
}
