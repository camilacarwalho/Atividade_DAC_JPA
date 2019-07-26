package domain;

import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Livro implements Serializable {

    private String ISBN;
    private String nome;
    private Date lançamento;

    @ManyToMany(mappedBy = "livros")
    private List<Autor> autores;

    public Livro() {
    }

    public Livro(String ISBN, String nome, Date lançamento, List<Autor> autores) {
        this.ISBN = ISBN;
        this.nome = nome;
        this.lançamento = lançamento;
        this.autores = autores;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getLançamento() {
        return lançamento;
    }

    public void setLançamento(Date lançamento) {
        this.lançamento = lançamento;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
}
