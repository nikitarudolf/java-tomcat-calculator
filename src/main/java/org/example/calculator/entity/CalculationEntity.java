package org.example.calculator.entity;
import lombok.*;
import org.example.calculator.dto.CalculationDTO;

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

    public static CalculationEntity fromDTO(CalculationDTO dto) {
        return CalculationEntity.builder()
                .a(dto.a())
                .b(dto.b())
                .operation(dto.operation())
                .result(dto.result())
                .build();
    }

    public CalculationDTO toDTO() {
        return new CalculationDTO(
                this.a,
                this.b,
                this.operation,
                this.result
        );
    }
}


