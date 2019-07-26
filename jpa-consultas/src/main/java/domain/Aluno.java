package domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Aluno implements Serializable {

    private String matricula;
    private Date dataIngreso;
    private String turma;

    public Aluno() {
    }

    public Aluno(String matricula, Date dataIngreso, String turma) {
        this.matricula = matricula;
        this.dataIngreso = dataIngreso;
        this.turma = turma;
    }

    public String getmatricula() {
        return matricula;
    }

    public void setmatricula(String matricula) {
        this.matricula = matricula;
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
                "matricula='" + matricula + '\'' +
                ", dataIngreso=" + dataIngreso +
                ", turma='" + turma + '\'' +
                '}';
    }
}
