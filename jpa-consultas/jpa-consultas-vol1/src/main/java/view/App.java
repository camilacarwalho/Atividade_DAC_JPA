package view;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {

        EntityManager em = Persistence
                .createEntityManagerFactory("AtividadeVol1")
                .createEntityManager();
        new IniciandorBancoDados(em).dadosIniciais();
        
        

        System.out.println("HelloWorld");
    }
}
