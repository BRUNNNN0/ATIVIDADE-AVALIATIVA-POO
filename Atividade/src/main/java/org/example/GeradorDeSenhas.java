package org.example;

import java.util.Random;

public class GeradorDeSenhas {
    private static final String LetrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
    private static final String LetrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String Numeros = "0123456789";
    private static final String Simbolos = "!@#$%^&*()-_=+[]{}|;:',.<>?/";
    private static final Random Aleatorio = new Random();

    public String gerarSenha(int comprimento, boolean Minusculas, boolean Maiusculas, boolean Numeros, boolean Caracter) {
        StringBuilder Acumular = new StringBuilder();

        if (Minusculas) {
            Acumular.append(LetrasMinusculas);
        }

        if (Maiusculas) {
            Acumular.append(LetrasMaiusculas);
        }

        if (Numeros) {
            Acumular.append(this.Numeros);
        }

        if (Caracter) {
            Acumular.append(Simbolos);
        }


        StringBuilder senha = new StringBuilder(comprimento);
        for (int i = 0; i < comprimento; i++) {
            int index = Aleatorio.nextInt(Acumular.length());
            senha.append(Acumular.charAt(index));
        }

        return senha.toString();
    }
}