package Unidade4.Aula4;

import java.sql.SQLException;

public class InsertExample extends CRUDBase {

    public static void main(String[] args) {
        new InsertExample().run();
    }

    public void run() {

        String sql = "INSERT INTO Clientes (ID, Nome, Email, DataNascimento) VALUES (?, ?, ?, ?)";

        int rowsAffected = executeUpdate(sql, preparedStatement -> {
            preparedStatement.setInt(1, 22);
            preparedStatement.setString(2, "Maria Oliveira");
            preparedStatement.setString(3, "maria.oliveira@example.com");
            preparedStatement.setDate(4, java.sql.Date.valueOf("1990-08-25"));
        });

        System.out.println("Linhas afetadas: " + rowsAffected);
        printOperationFinished("inserção");
    }

    @Override
    protected void handleSQLException(SQLException e, String customMessage) {
        e.printStackTrace();
        if (e.getErrorCode() == 1062) {
            System.out.println(RED + "Erro: ID já existe. Tente um ID diferente." + RESET);
        } else {
            System.out.println(RED + customMessage + RESET);
        }
    }
}