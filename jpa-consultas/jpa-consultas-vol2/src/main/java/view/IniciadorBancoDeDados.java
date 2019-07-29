package view;

import domain.Revisor;

import javax.persistence.EntityManager;
import java.sql.Date;
import java.time.LocalDate;

public class IniciadorBancoDeDados {

    private Revisor[] revisores={
           new Revisor( 3,
            "Neil Gaiman",
            Date.valueOf(LocalDate.of(1970,05,25)),
            "Ótima"
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
        em.getTransaction().commit();
    }
}
