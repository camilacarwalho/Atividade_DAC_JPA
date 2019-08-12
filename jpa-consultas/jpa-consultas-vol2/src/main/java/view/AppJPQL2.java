package view;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class AppJPQL2 {
    public static void main(String[] args) {

        EntityManager em = Persistence
                .createEntityManagerFactory("AtividadeVol2")
                .createEntityManager();
        new IniciadorBancoDeDados(em).dadosIniciais();


    }

    //O nome da pessoa, o título da publicação e o nome da área em que a pessoa tem o
    //atributo id igual a 3.
    private static void letraA(EntityManager em) {
        //consulta jpql
        String jpql="SELECT esc.nome, pu.titulo, a.nome FROM Escritor esc, " +
                "IN(esc.publicacoes) pu, IN(pu.areas) a WHERE esc.id=3";

        TypedQuery<Object[]> query = em.createQuery(jpql,Object[].class);
        //listando de acordo com a consulta
        query.getResultList().forEach(
                p-> System.out.println("nome da pessoa: "+p[0]+"\n título da publicação: "+p[1]+"\n área: "+p[2]+"\n")
        );
    }

    //O título da publicação e o nome do revisor que tenham alguma publicação na área
    //de indústria.
    private static void letraB(EntityManager em) {
        //consulta jpql selecionando titulo da publicação e nome do revisor
        String jpql="SELECT p.titulo, rev.nome FROM Revisor rev, IN (rev.publicacoes) p,IN(p.areas) a " +
                "WHERE LOWER(a.nome) like '%industria%' ";
        TypedQuery<Object[]> query = em.createQuery(jpql,Object[].class);
        query.getResultList().forEach(
                p-> System.out.println(" título da publicação: "+p[0]+"\nnome do revisor: "+p[1]+"\n")
        );
    }

    //O nome dos Revisores que possuem alguma publicação começando com Java.
    private static void letraC(EntityManager em) {
        String jpql="SELECT rev.nome FROM Revisor rev, IN(rev.publicacoes) p WHERE LOWER(p.titulo) LIKE 'java%'";
        TypedQuery<String> query = em.createQuery(jpql, String.class);
        query.getResultList().forEach(System.out::println);
    }

    //O nome e a quantidade de Publicações escritas por Escritores com mais que três
    //prêmios.
    private static void letraD(EntityManager em) {
        String jpql = "SELECT esc.nome, count(p) FROM Escritor esc, in(esc.publicacoes) p " +
                "WHERE esc.premios>3 GROUP BY esc.nome";
        TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);
        query.getResultList().forEach(
                e-> System.out.println("nome do escritor: "+e[0]+" quantidade de publicações: "+e[1])
        );

    }
}
