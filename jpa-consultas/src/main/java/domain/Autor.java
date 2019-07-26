package domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class Autor extends Pessoa implements Serializable  {

    private String instituicaoVInculada;

    @ManyToMany
    @JoinTable(name="autorLivro",
            joinColumns = @JoinColumn(name = "autor_id"),
             inverseJoinColumns = @JoinColumn(name = "livro_id") )
    private List<Livro> livros;

    public Autor(){

    }

    public Autor(String nome, String cpf, int idade, Date dataNascimento, Endereco endereco, String instituicaoVInculada, List<Livro> livros) {
        super(nome, cpf, idade, dataNascimento, endereco);
        this.instituicaoVInculada = instituicaoVInculada;
        this.livros = livros;
    }


    public String getInstituicaoVInculada() {
        return instituicaoVInculada;
    }

    public void setInstituicaoVInculada(String instituicaoVInculada) {
        this.instituicaoVInculada = instituicaoVInculada;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
