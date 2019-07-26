package domain;

import javax.persistence.Entity;
import java.io.Serializable;
@Entity

public class Area implements Serializable {
    private int cod;
    private String nome;

    public Area(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
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
