 package Unidade4.Aula3;

import java.util.ArrayList;

class ListaNomes {

    private ArrayList<String> nomes;
    public ListaNomes() {
        this.nomes = new ArrayList<>();
    }

    public void addNome(String nome) {
        this.nomes.add(nome);
       
        System.out.println("Adicionado: " + nome + "\n");
    }

    public void removerNome(String nome){
        this.nomes.remove(nome);
        
        System.out.println("Removido: " + nome + "\n" );
    }

    public void imprimirLista(){
        for (String nome: nomes){
            System.out.println(nome);
        }
    }
}