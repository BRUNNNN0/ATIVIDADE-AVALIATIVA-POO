package org.example;

public class Tarefa {

    private String Nome;
    private String Prazo;
    private boolean Concluida;

    public Tarefa(String nome, String prazo) {
        this.Nome = nome;
        this.Prazo = prazo;
        this.Concluida = false;
    }

    public String getNome() {
        return Nome;
    }

    public String getPrazo() {
        return Prazo;
    }


    public void concluirTarefa() {
        this.Concluida = true;
    }

    public boolean isConcluida() {
        return Concluida;
    }

    public void alterarPrazo(String prazo) {
        this.Prazo = prazo;
    }
}