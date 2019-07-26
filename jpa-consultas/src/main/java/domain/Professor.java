package domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Professor extends Pessoa  {
    @OneToMany
    private Set<Telefone> telefones = new HashSet<>();

    private Double salario;

    public Professor() { }

    public Professor(String nome, String cpf, int idade, Date dataNascimento, Endereco endereco, Double salario) {
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
