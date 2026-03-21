package Unidade4.Aula1.ExemploVideo;

import java.util.ArrayList;
import java.util.List;

public class CanalNoticia {
    private List<Observador> observadores = new ArrayList<>();
    private String noticia;

    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    public void novaNoticia(String noticia) {
        this.noticia = noticia;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador o : observadores) {
            o.atualizar(noticia);
        }
    }
}
