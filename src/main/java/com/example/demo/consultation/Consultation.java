package com.example.demo.consultation;

import lombok.*;

import javax.persistence.*;
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
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 100)
    private String title;

    @Column(nullable = false,length = 1000)
    private String description;

    @Column(nullable = false,length = 100)
    private String price;
}
