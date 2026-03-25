package Unidade4.Aula4;

public class QueryExample extends CRUDBase {

    public static void main(String[] args) {
        new QueryExample().run();
    }

    public void run() {

        executeQuery("SELECT * FROM Clientes", resultSet -> {

            while (resultSet.next()) {

                int id = resultSet.getInt("ID");

                String nome = resultSet.getString("Nome");

                String email = resultSet.getString("Email");

                String dataNascimento = resultSet.getString("DataNascimento");
                System.out.println("-----------------------------------\n");

                System.out.println("ID: " + id + ", Nome: " + nome + ", Email: " + email + ", Data de Nascimento: "
                        + dataNascimento + "\n");

            }
        });

    }

}