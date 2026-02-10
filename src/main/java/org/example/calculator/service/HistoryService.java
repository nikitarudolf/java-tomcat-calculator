package org.example.calculator.service;
import org.example.calculator.dao.CalculationDAO;
import org.example.calculator.dto.CalculationDTO;
import org.example.calculator.entity.CalculationEntity;
import org.example.calculator.mapper.CalculationMapper;

import java.util.List;

public class HistoryService {
    private final CalculationDAO calcDao = new CalculationDAO();

    public void push(CalculationDTO dto) {
        calcDao.save(CalculationMapper.toEntity(dto));
    }

    public List<CalculationDTO> get() {
        return calcDao.findAll().stream()
                .map(CalculationMapper::toDTO)
                .toList();
    }
}
