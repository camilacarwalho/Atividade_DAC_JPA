package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Publicacao implements Serializable {

    @Id
    private int codPublicacao;
    private String titulo;

    public Publicacao() {
    }

    public int getCodPublicacao() {
        return codPublicacao;
    }

    public void setCodPublicacao(int codPublicacao) {
        this.codPublicacao = codPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
