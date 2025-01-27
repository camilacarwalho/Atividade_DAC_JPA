package domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Area implements Serializable {

	@Id
    private int cod;
    private String nome;

    @ManyToOne
    @JoinTable(name="area_publicacao",
            joinColumns = {@JoinColumn(name = "area_id",referencedColumnName = "cod")},
            inverseJoinColumns = {@JoinColumn(name="publicacao_id",referencedColumnName = "codPublicacao")})
    private Publicacao publicacao;

    public Area(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    public Area() {
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
