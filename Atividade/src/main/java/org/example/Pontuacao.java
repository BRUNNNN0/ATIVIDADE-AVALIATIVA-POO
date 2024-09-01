package org.example;

public class Pontuacao {
    private int Pontuacao;


    public int getPontuacao() {
        return Pontuacao;
    }


    public void adicionarPontos(int i) {
        this.Pontuacao = i;
    }

    public void removerPontos(int i) {
        if (i > this.Pontuacao) {
            System.out.println("A pontuação não pode ser negativa!");
        } else {
            this.Pontuacao -= i;
        }
    }
}
