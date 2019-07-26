package domain;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Autor extends Pessoa implements Serializable  {
    private String instituicaoVInculada;

    public Autor(){

    }

    public Autor(String nome, String cpf, int idade, Date dataNascimento, Endereco endereco, String instituicaoVInculada) {
        super(nome, cpf, idade, dataNascimento, endereco);
        this.instituicaoVInculada = instituicaoVInculada;
    }


    public String getInstituicaoVInculada() {
        return instituicaoVInculada;
    }

    public void setInstituicaoVInculada(String instituicaoVInculada) {
        this.instituicaoVInculada = instituicaoVInculada;
    }
}
