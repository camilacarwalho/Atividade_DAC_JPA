package domain;

import javax.persistence.Entity;

@Entity
public class Escritor extends Pessoa {

    private int premios;

    public Escritor() {
    }

    public Escritor(int premios) {
        this.premios = premios;
    }

    public int getPremios() {
        return premios;
    }

    public void setPremios(int premios) {
        this.premios = premios;
    }

    @Override
    public String toString() {
        return "Escritor{" +
                "premios=" + premios +
                '}';
    }
}
