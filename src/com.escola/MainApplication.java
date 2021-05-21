package com.escola;

public class MainApplication {

    public static void main(String... args) {
        Turma turma = new Turma("8", "C");

        Disciplina matematica = new Disciplina("Matematica", 80);
        Disciplina portugues = new Disciplina("Portugues", 40);

        Estudante luiz = new Estudante("Luiz", 23, "0023123", "3");
        Estudante marcos = new Estudante("Marcos", 23, "0023124", "4");

        turma.adicionarDisciplina(matematica, portugues);
        turma.adicionarEstudante(luiz, marcos);

        System.out.println(turma);
    }
}