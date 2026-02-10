package org.example.calculator.dao;

import org.example.calculator.config.DatabaseConfig;
import org.example.calculator.entity.CalculationEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CalculationDAO {
    public void save(CalculationEntity calc) {
        try (Connection connection = DatabaseConfig.getConnection();){
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO calculations(num1, num2, operation, result) VALUES (?,?,?,?) ");
            preparedStatement.setDouble(1,calc.getA());
            preparedStatement.setDouble(2,calc.getB());
            preparedStatement.setString(3,calc.getOperation());
            preparedStatement.setDouble(4,calc.getResult());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<CalculationEntity> findAll() {
        List<CalculationEntity> calculations = new ArrayList<>();
        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement preparedStatement = connection
                     .prepareStatement("SELECT id, num1, num2, operation, result," +
                             "timestamp FROM calculations ORDER BY id DESC");
             ResultSet resultSet = preparedStatement.executeQuery();) {

            while(resultSet.next()) {
                CalculationEntity calc = new CalculationEntity(
                        resultSet.getLong("id"),
                        resultSet.getDouble("num1"),
                        resultSet.getDouble("num2"),
                        resultSet.getString("operation"),
                        resultSet.getDouble("result"),
                        resultSet.getTimestamp("timestamp").toLocalDateTime()
                );
                calculations.add(calc);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return calculations;
    }
}
