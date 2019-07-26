package view;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import domain.Endereco;
import domain.Pessoa;

public class IniciandorBancoDados {
	
	
	private Pessoa[] pessoas = {
			new Pessoa(
					"Geraldo Elias Rocha", 
					"358.970.283-46", 
					22, 
					Date.valueOf(LocalDate.of(1997, 5, 4)), 
					new Endereco(
							"Rua Getúlio Vargas",
							"Salobro", 
							"Caxias-MA", 
							"65609-580"))
			
	};
	
	private final EntityManager em;
	
	public IniciandorBancoDados(EntityManager em) {
		this.em = em;
	}
	
	public void dadosIniciais() {
		em.getTransaction().begin();
		for (Pessoa pessoa : pessoas) {
			em.persist(pessoa);
		}
		em.getTransaction().commit();
		
		
	}

}
