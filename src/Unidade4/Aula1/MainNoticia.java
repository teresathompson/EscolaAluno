package Unidade4.Aula1;

public class MainNoticia {

    public static void main(String[] args) {
        System.out.println("\n Exemplo de Padrão Observer para Notícia \n");

        CanalNoticia canal = new CanalNoticia();
        Usuario usuario1 = new Usuario("Fernando");
        Usuario usuario2 = new Usuario("Andrea");

        canal.adicionarObservador(usuario1);
        canal.adicionarObservador(usuario2);

        canal.novaNoticia("Notícia 1: O posto de gasolina é o local mais caro de frequentar no momento. \n");

    }

}
