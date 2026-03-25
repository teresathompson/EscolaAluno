package Unidade4.Aula4;

public class DeleteExample extends CRUDBase {

	public static void main(String[] args) {
		new DeleteExample().run();
	}

	public void run() {
		String sql = "DELETE FROM Clientes WHERE ID = ?";

		int rowsAffected = executeUpdate(sql, preparedStatement -> {
			preparedStatement.setInt(1, 21);
		});

		if (rowsAffected > 0) {
			System.out.println(GREEN + "Registro removido com sucesso!" + RESET);
		} else {
			System.out.println(RED + "Nenhum registro foi encontrado com esse ID." + RESET);
		}

		System.out.println("Linhas afetadas: " + rowsAffected);
		printOperationFinished("remoção");
	}
}
