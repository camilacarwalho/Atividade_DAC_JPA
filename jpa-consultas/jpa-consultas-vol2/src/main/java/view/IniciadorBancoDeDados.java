package view;

import domain.Area;
import domain.Escritor;
import domain.Publicacao;
import domain.Revisor;

import javax.persistence.EntityManager;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class IniciadorBancoDeDados {

    private Revisor[] revisores={
           new Revisor(
                   3,
                   "Neil Gaiman",
                   Date.valueOf(LocalDate.of(1970,05,25)),
                   "Ótima",
                   new ArrayList<>()
           ),
            new Revisor(
                    8,
                    "Jensen Ackles",
                    Date.valueOf(LocalDate.of(1978,03,01)),
                    "Bom",
                    new ArrayList<>()
            )

    };

    private Escritor[] escritores = {
            new Escritor(
                    25,
                    "George R. R. Martin",
                    Date.valueOf(LocalDate.of(1948,9,20)),
                    5,
                    new ArrayList<>()
            ),
            new Escritor(
                    70,
                    "Stephen King",
                    Date.valueOf(LocalDate.of(1947,9,21)),
                    2,
                    new ArrayList<>()
            ),
            new Escritor(
                    5,
                    "J. K. Rowling",
                    Date.valueOf(LocalDate.of(1965,7,31)),
                    7,
                    new ArrayList<>()
            )

    };

    private Area[] areas = {
            new Area(
                    101,
                    "Industria"
            ),
            new Area(
                    110,
                    "Tecnologia"
            ),
            new Area(
                    135,
                    "Entretenimento"
            )
    };

    private Publicacao[] publicacoes = {
            new Publicacao(
                    2022,
                    "Java Enterprise - EJB",
                    Arrays.asList(areas[1]),
                    revisores[0],
                    escritores[2]
            ),
            new Publicacao(
                    2051,
                    "Postgres - O melhor banco de dados",
                    Arrays.asList(areas[0],areas[1]),
                    revisores[1],
                    escritores[0]
            ),
            new Publicacao(
                    3080,
                    "Harry Potter tera continuacao?",
                    Arrays.asList(areas[2]),
                    revisores[1],
                    escritores[2]
            ),
            new Publicacao(
                    5587,
                    "Novo PS5",
                    Arrays.asList(areas[1],areas[2]),
                    revisores[0],
                    escritores[1]
            )
    };

    private final EntityManager em;

    public IniciadorBancoDeDados(EntityManager em) {
        this.em = em;
    }

    public void dadosIniciais(){
        em.getTransaction().begin();
        for(Revisor revisor:revisores){
            em.persist(revisor);
        }
        for(Escritor escritor:escritores){
            em.persist(escritor);
        }
        for(Area area:areas){
            em.persist(area);
        }
        for(Publicacao publicacao:publicacoes){
            em.persist(publicacao);
        }
        em.getTransaction().commit();
    }
}
