package org.example.calculator.mapper;

import org.example.calculator.dto.CalculationDTO;
import org.example.calculator.entity.CalculationEntity;

import java.util.Objects;

public class CalculationMapper {
    private CalculationMapper() {}

    public static CalculationDTO toDTO(CalculationEntity entity) {
        if (Objects.isNull(entity)) return null;

        return new CalculationDTO(
                entity.getA(),
                entity.getB(),
                entity.getOperation(),
                entity.getResult()
        );
    }

    public static CalculationEntity toEntity(CalculationDTO dto) {
        if (Objects.isNull(dto)) return null;

        return CalculationEntity.builder()
                .a(dto.a())
                .b(dto.b())
                .operation(dto.operation())
                .result(dto.result())
                .build();
    }
}