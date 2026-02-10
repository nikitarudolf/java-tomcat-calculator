package org.example.calculator.entity;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class CalculationEntity {
    private Long id;
    private double a;
    private double b;
    private String operation;
    private double result;
    private LocalDateTime timestamp;
}


