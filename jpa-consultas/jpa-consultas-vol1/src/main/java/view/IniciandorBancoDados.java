package view;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;

import domain.*;

//import static domain.Livro_.autores;

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
	
	private Aluno[] alunos = {
			new Aluno(
					"Kaique Sebastião Jesus", 
					"233.658.848-07",
					23, 
					Date.valueOf(LocalDate.of(1996, 7, 7)),
					new Endereco(
							"Rua das Dalias, 1004", 
							"Setor Sônia Regina (Taquaralto)",
							"Palmas-TO",
							"77060-680"),
					"20171201001", 
					Date.valueOf(LocalDate.of(2015, 4, 21)),
					"ads.t1"),
			new Aluno(
					"Arthur Pedro dos Santos", 
					"471.157.819-66",
					20, 
					Date.valueOf(LocalDate.of(1998, 11, 22)),
					new Endereco(
							"Rua Cosme, 57", 
							"Turu",
							"São Luís-MA",
							"65065-680"),
					"20171201002", 
					Date.valueOf(LocalDate.of(2015, 4, 21)),
					"2017.1"),
			new Aluno(
					"Elaine Jéssica Corte Real", 
					"346.640.612-93",
					39, 
					Date.valueOf(LocalDate.of(1980, 1, 23)),
					new Endereco(
							"Rua Plácido de Castro, 13", 
							"Juscelino Kubitschek",
							"Porto Velho-RO",
							"76829-386"),
					"20171201003", 
					Date.valueOf(LocalDate.of(2015, 4, 21)),
					"2018.2"),
			new Aluno(
					"Igor Pedro Henrique de Paula", 
					"152.821.262-22",
					22, 
					Date.valueOf(LocalDate.of(1996, 12, 23)),
					new Endereco(
							"Avenida Manoel de Araújo Piau, 101", 
							"Vila Poroxo",
							"Rondonópolis-MT",
							"78730-168"),
					"20171201004", 
					Date.valueOf(LocalDate.of(2015, 4, 21)),
					"2019.1")
	};
	
	private Telefone[][] telefones= {
			{
				new Telefone("(95) 3887-5418", TelefoneType.RESIDENCIAL),
				new Telefone("(95) 99637-0393", TelefoneType.COMERCIAL)
			},
			{
				new Telefone("(96) 3643-1597", TelefoneType.RESIDENCIAL),
				new Telefone("(96) 98386-2048", TelefoneType.COMERCIAL)
			},
			{ 
				new Telefone("(84) 2518-3617", TelefoneType.RESIDENCIAL),
				new Telefone("(84) 98989-9890", TelefoneType.COMERCIAL)
			}
			
	};
	
	private Professor[] profesores= {
			new Professor(
					"Guilherme Cláudio Osvaldo Campos", 
					"467.236.719-37", 
					60, 
					Date.valueOf(LocalDate.of(1958, 10, 22)),
					new Endereco(
							"Rua Mar das Antilhas, 521", 
							"Chácara Cachoeira",
							"Campo Grande-MT",
							"79040-081"),
					Arrays.asList(),
					13513.21),
			new Professor(
					"Antônia Lavínia Natália Porto", 
					"543.816.299-90", 
					24, 
					Date.valueOf(LocalDate.of(1995, 3, 1)),
					new Endereco(
							"Que atividade facil",
							"Dom Jaime Câmara",
							"Mossoró-RN",
							"59628-501"),
					Arrays.asList(telefones[1]),
					9425.37),
			new Professor(
					"Priscila Francisca Emily Baptista", 
					"504.232.736-39", 
					47, 
					Date.valueOf(LocalDate.of(1972, 5, 11)),
					new Endereco(
							"Rua HC-17, 588", 
							"Dom Jaime Câmara",
							"Boa Vista-RR",
							"69316-492"),
					Arrays.asList(telefones[2]),
					9425.37)
	};

	private Livro[] livros = {
			new Livro(
					"40.986.886-3",
					"Arqueiro Verde",
					Date.valueOf(LocalDate.of(2019,06,22)),
					new ArrayList<>()

			),
			new Livro(
					"48.724.584-2",
					"Sobrevivendo ao 5º Período",
					Date.valueOf(LocalDate.of(2019,06,01)),
					new ArrayList<>()
			),
			new Livro(
					"44.082.268-3",
					"Existe vida durante DAC?",
					Date.valueOf(LocalDate.of(2019,06,01)),
					new ArrayList<>()
			),
			new Livro(
					"24.255.793-4",
					"Mitologia Nórdica",
					Date.valueOf(LocalDate.of(2017,03,13)),
					new ArrayList<>()
			),
			new Livro(
					"19.208.373-9",
					"Medo Clássico Vol1",
					Date.valueOf(LocalDate.of(2019,02,21)),
					new ArrayList<>()
			)
	};
	
	private Livro[] grupoLivroI = { 
			livros[1], 
			livros[2]} ;
	private Livro[] grupoLivroII = { 
			livros[1], 
			livros[4],
			livros[2]} ;
	private Livro[] grupoLivroIII = { 
			livros[0], 
			livros[3]} ;
	private Livro[] grupoLivroIV = {
			livros[4],
			livros[3],
			livros[2]} ;
	
	private Autor[] autores = {
		new Autor(
				"Beatriz Eliane Lúcia Gonçalves",
				"944.444.968-86",
				45,
				Date.valueOf(LocalDate.of(1973, 10, 24)),
				new Endereco(
						"Vila Araguaia, 619",
						"Pernambués",
						"Cajazeiras-PB",
						"41110-150"),
				"Rascalovski",
				Arrays.asList(grupoLivroI)),
		new Autor(
				"Vitória Heloisa Vera Teixeira",
				"416.648.264-59",
				70,
				Date.valueOf(LocalDate.of(1949, 04, 18)),
				new Endereco(
						"Rua 4, 526",
						"Jardim dos Ipês III",
						"Araguaína-TO",
						"77820-340"),
				"Zeiwry",
				Arrays.asList(grupoLivroII)),
		new Autor(
				"Aline Amanda da Silva",
				"401.244.252-08",
				41,
				Date.valueOf(LocalDate.of(1982, 11, 21)),
				new Endereco(
						"Avenida Primeiro de Março, 520",
						"Centro",
						"Cajazeiras-PB",
						"93320-043"),
				"Rascalkun",
				Arrays.asList(grupoLivroIII)),
		new Autor(
				"Jason Luan Bruno Ferreira",
				"053.622.447-10",
				35,
				Date.valueOf(LocalDate.of(1984, 04, 18)),
				new Endereco(
						"Avenida Rio Negro, 282",
						"Curuzu",
						"Salvador-BA",
						"40365-720"),
				"Colossalchenko",
				Arrays.asList(grupoLivroIV))
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
		for (Aluno aluno : alunos) {
			em.persist(aluno);
		}
		for (Professor professor : profesores) {
			em.persist(professor);
		}
		for(Livro livro:livros){
			em.persist(livro);
		}
		for(Autor autor: autores){
			em.persist(autor);
		}
		em.getTransaction().commit();
		
		
	}

}
