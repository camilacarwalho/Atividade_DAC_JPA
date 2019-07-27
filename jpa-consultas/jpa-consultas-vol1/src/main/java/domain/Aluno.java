package domain;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Aluno extends Pessoa implements Serializable  {

    private String matricula;
    @Temporal(TemporalType.DATE)
    private Date dataIngreso;
    private String turma;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, int idade, Date dataNascimento, Endereco endereco, String matricula,
			Date dataIngreso, String turma) {
		super(nome, cpf, idade, dataNascimento, endereco);
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
