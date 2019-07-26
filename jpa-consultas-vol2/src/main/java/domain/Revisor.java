package domain;

import javax.persistence.Entity;

@Entity
public class Revisor extends Pessoa {

    private String nota;

    public Revisor() {
    }

    public Revisor(String nota) {
        this.nota = nota;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Revisor{" +
                "nota='" + nota + '\'' +
                '}';
    }
}
