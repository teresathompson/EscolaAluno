package Unidade4.Aula4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class CRUDBase {
    protected static final String RED = "\u001B[31m";
    protected static final String RESET = "\u001B[0m";
    protected static final String GREEN = "\u001B[32m";

    @FunctionalInterface
    protected interface PreparedStatementSetter {
        void setValues(PreparedStatement preparedStatement) throws SQLException;
    }

    @FunctionalInterface
    protected interface ResultSetHandler {
        void handle(ResultSet resultSet) throws SQLException;
    }

    protected Connection getConnection() throws SQLException {
        return DatabaseConnection.getConnection();
    }

    protected int executeUpdate(String sql, PreparedStatementSetter setter) {
        try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            setter.setValues(preparedStatement);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            handleSQLException(e, "Erro ao executar comando de atualização no banco de dados.");
            return 0;
        }
    }

    protected void executeQuery(String sql, ResultSetHandler handler) {
        try (Connection connection = getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            handler.handle(resultSet);
        } catch (SQLException e) {
            handleSQLException(e, "Erro ao executar consulta no banco de dados.");
        }
    }

    protected void handleSQLException(SQLException e, String customMessage) {
        e.printStackTrace();
        if (customMessage != null && !customMessage.isEmpty()) {
            System.out.println(RED + customMessage + RESET);
        }
    }

    protected void printOperationFinished(String operationName) {
        System.out.println(GREEN + "Operação de " + operationName + " concluída." + RESET);
    }
}
