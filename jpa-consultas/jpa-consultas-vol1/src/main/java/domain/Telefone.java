package domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.io.Serializable;

@Entity
public class Telefone implements Serializable {

	@Id
	private int id;
    private String numero;
    private TelefoneType tipo;

    public Telefone() { }

    public Telefone(String numero, TelefoneType tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TelefoneType getTipo() {
        return tipo;
    }

    public void setTipo(TelefoneType tipo) {
        this.tipo = tipo;
    }
}
