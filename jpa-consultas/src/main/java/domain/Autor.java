package domain;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Autor extends Pessoa implements Serializable  {
    private String instituicaoVInculada;

    public Autor(){

    }

    public Autor(String nome, String cpf, int idade, LocalDate dataNascimento, String instituicaoVInculada) {
        super(nome, cpf, idade, dataNascimento);
        this.instituicaoVInculada = instituicaoVInculada;
    }


    public String getInstituicaoVInculada() {
        return instituicaoVInculada;
    }

    public void setInstituicaoVInculada(String instituicaoVInculada) {
        this.instituicaoVInculada = instituicaoVInculada;
    }
}
