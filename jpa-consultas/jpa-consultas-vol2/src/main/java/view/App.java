package view;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {

        EntityManager em = Persistence
                .createEntityManagerFactory("AtividadeVol2")
                .createEntityManager();
        new IniciadorBancoDeDados(em).dadosIniciais();

    }
}
