package com.alexandre.app;

import com.alexandre.io.Console;

/**
 * Representa um jogador
 * */
@SuppressWarnings("all")
public class Player {
    /**
     * Nome do jogador
     * */
    private String nome;
    /**
     * Simbolo do jogador: 'X' ou 'O'
     * */
    private char simbolo;
/**
 * Construtor do jogador
 * @param nome
 * @param simbolo
 * */
    public Player(String nome, char simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
    }

    public String getNome() {
        return nome;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public Move getMove() throws InvalidMoveException {
        String str = Console.readString();
        return new Move(str);
    }
}
