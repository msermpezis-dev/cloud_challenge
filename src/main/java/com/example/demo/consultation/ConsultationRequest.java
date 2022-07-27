package com.example.demo.consultation;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * @author msermpezis-dev
 * @project demo
 * @created 12:26 π.μ. - 24/07/2022
 */
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ConsultationRequest {
    private final String title;
    private final String description;
    private final Double price;
}
