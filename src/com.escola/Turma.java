package com.escola;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Turma {
    private String serie;

    private String codIdentificador;

    private final List<Disciplina> disciplinas;

    private final List<Estudante> estudantes;

    public Turma(String serie, String codIdentificador, List<Disciplina> disciplinas, List<Estudante> estudantes) {
        this.serie = serie;
        this.codIdentificador = codIdentificador;
        this.disciplinas = disciplinas;
        this.estudantes = estudantes;
    }

    public Turma(String serie, String codIdentificador) {
        this.serie = serie;
        this.codIdentificador = codIdentificador;
        this.disciplinas = new ArrayList<>();
        this.estudantes = new ArrayList<>();
    }

    public boolean adicionarDisciplina(Disciplina... disciplinas) {
        // TODO: Validacao de uma disciplina
        return this.disciplinas.addAll(Arrays.asList(disciplinas));
    }

    public boolean adicionarEstudante(Estudante... estudantes) {
        // TODO: Validacao de um estudante
        return this.estudantes.addAll(Arrays.asList(estudantes));
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCodIdentificador() {
        return codIdentificador;
    }

    public void setCodIdentificador(String codIdentificador) {
        this.codIdentificador = codIdentificador;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "\nserie='" + serie + '\'' +
                ", \ncodIdentificador='" + codIdentificador + '\'' +
                ", \ndisciplinas=" + disciplinas +
                ", \nestudantes=" + estudantes +
                '}';
    }
}
