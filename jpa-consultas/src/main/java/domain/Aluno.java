package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Aluno implements Serializable {

    @Id
    private String matricuala;
    private Date dataIngreso;
    private String turma;

    public Aluno() {
    }

    public Aluno(String matricuala, Date dataIngreso, String turma) {
        this.matricuala = matricuala;
        this.dataIngreso = dataIngreso;
        this.turma = turma;
    }

    public String getMatricuala() {
        return matricuala;
    }

    public void setMatricuala(String matricuala) {
        this.matricuala = matricuala;
    }

    public Date getDataIngreso() {
        return dataIngreso;
    }

    public void setDataIngreso(Date dataIngreso) {
        this.dataIngreso = dataIngreso;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricuala='" + matricuala + '\'' +
                ", dataIngreso=" + dataIngreso +
                ", turma='" + turma + '\'' +
                '}';
    }
}
