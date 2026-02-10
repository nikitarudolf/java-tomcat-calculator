package org.example.calculator.service;
import org.example.calculator.dao.CalculationDAO;
import org.example.calculator.dto.CalculationDTO;
import org.example.calculator.entity.CalculationEntity;

import java.util.List;

public class HistoryService {
    private final CalculationDAO calcDao = new CalculationDAO();

    public void push(CalculationDTO dto) {
        calcDao.save(CalculationEntity.fromDTO(dto));
    }

    public List<CalculationDTO> get() {
        return calcDao.findAll().stream()
                .map(CalculationEntity::toDTO)
                .toList();
    }
}
