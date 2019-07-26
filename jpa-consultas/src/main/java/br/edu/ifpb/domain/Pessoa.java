package br.edu.ifpb.domain;


import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String cpf;
    private int idade;
    private LocalDate dataNascimento;

    public Pessoa() {}

    public Pessoa(String nome, String cpf, int idade, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
    }
}
