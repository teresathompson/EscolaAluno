package Unidade4.Aula4;

public class UpdateExample extends CRUDBase {

    public static void main(String[] args) {
        new UpdateExample().run();
    }

    public void run() {
        String sql = "UPDATE Clientes SET Email = ? WHERE ID = ?";

        int rowsAffected = executeUpdate(sql, preparedStatement -> {
            preparedStatement.setString(1, "maria.novoemail@example.com");
            preparedStatement.setInt(2, 2);
        });

        if (rowsAffected > 0) {
            System.out.println(GREEN + "Email atualizado com sucesso!" + RESET);
        } else {
            System.out.println(RED + "Nenhum registro foi encontrado com esse ID." + RESET);
        }

        System.out.println("Linhas afetadas: " + rowsAffected);
        printOperationFinished("atualização");
    }
}