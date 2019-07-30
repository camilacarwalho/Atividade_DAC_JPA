package view;

import domain.Escritor;
import domain.Revisor;

import javax.persistence.EntityManager;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

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
        em.getTransaction().commit();
    }
}
