package com.alexandre.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Lógica do jogo.
 * */
@SuppressWarnings("all")
public class Game {

    /**
     * Tabuleiro do jogo.
     * */
    private Board board = new Board();

    /**
     * Lista de jogadores.
     * */
    private List<Player> players = new ArrayList<>();
}
