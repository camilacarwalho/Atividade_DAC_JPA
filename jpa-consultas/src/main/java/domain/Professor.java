package domain;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Professor extends Pessoa  {

    private Double salario;

    public Professor() { }

    public Professor(String nome, String cpf, int idade, LocalDate dataNascimento, Endereco endereco, Double salario) {
        super(nome, cpf, idade, dataNascimento, endereco);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
