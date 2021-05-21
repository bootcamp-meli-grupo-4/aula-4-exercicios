package com.escola;

public class Estudante {
    private String nome;

    private Integer idade;

    private String numMatricula;

    private String serie;

    public Estudante(String nome, Integer idade, String numMatricula, String serie) {
        this.nome = nome;
        this.idade = idade;
        this.numMatricula = numMatricula;
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "\n  Estudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", numMatricula='" + numMatricula + '\'' +
                ", serie='" + serie + '\'' +
                '}';
    }
}
