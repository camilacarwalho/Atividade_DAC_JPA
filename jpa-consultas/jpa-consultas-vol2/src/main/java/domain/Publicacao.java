package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class Publicacao implements Serializable {

    @Id
    private int codPublicacao;
    private String titulo;

    @OneToMany(mappedBy = "publicacao")
    private List<Area> areas;

    public Publicacao(int codPublicacao, String titulo, List<Area> areas) {
        this.codPublicacao = codPublicacao;
        this.titulo = titulo;
        this.areas = areas;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

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
