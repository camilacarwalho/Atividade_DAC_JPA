package view;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class AppCriteria2 {
    public static void main(String[] args) {

        EntityManager em = Persistence
                .createEntityManagerFactory("AtividadeVol2")
                .createEntityManager();
        new IniciadorBancoDeDados(em).dadosIniciais();

//        letraA(em);
//        letraB(em);
//        letraC(em);
//        letraD(em);
    }

    //O nome da pessoa, o título da publicação e o nome da área em que a pessoa tem o
    //atributo id igual a 3.
    private static void letraA(EntityManager em) {
    }

    //O título da publicação e o nome do revisor que tenham alguma publicação na área
    //de indústria.
    private static void letraB(EntityManager em) {
    }

    //O nome dos Revisores que possuem alguma publicação começando com Java.
    private static void letraC(EntityManager em) {
    }

    //O nome e a quantidade de Publicações escritas por Escritores com mais que três
    //prêmios.
    private static void letraD(EntityManager em) {
    }
}
