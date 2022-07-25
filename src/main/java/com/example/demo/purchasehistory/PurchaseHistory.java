package com.example.demo.purchasehistory;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class PurchaseHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long user_id;

    @Column(nullable = false)
    private Long appointment_id;

    @Column(nullable = false)
    private LocalDateTime purchase_time;

    @Column(nullable = false)
    private Long price;



}
