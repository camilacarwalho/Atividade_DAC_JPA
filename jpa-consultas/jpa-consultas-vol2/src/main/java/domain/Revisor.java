package domain;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Revisor extends Pessoa {

    private String nota;

    public Revisor() {
    }

    public Revisor(int id, String nome, Date dataNascimento, String nota) {
        super(id, nome, dataNascimento);
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
