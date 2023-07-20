package com.alexandre.app;

/**
 * Representa uma jogada
 * */
@SuppressWarnings("all")
public class Move {
/**
 * Posição i (linha)
 * */
    private int i;
/**
 * Posição j (coluna)
 * */
    private int j;
/**
 * @param move representa a jogada como string no padrão 'i,j'.
 * @throws InvalidMoveException lança uma exceção se a jogada for inválida.
 * */
    public Move(String move) throws InvalidMoveException {
        parseString(move);
    }
/**
 * @param move parse da string da jogada.
 * @throws InvalidMoveException lança uma exceção se a jogada for inválida.
 * */
    public void parseString(String move) throws InvalidMoveException {
        try {
            //Separar em dois tokens
            String[] tokens = move.split(",");

            //Armazena tokens nos atributos
            this.i = Integer.parseInt(tokens[0].trim());
            this.j = Integer.parseInt(tokens[1].trim());
        }catch (Exception e) {
            throw new InvalidMoveException("Jogada inválida!");
        }
    }
/**
 * Obtem a posição i.
 * @return posição i.
 * */
    public int getI() {
        return i;
    }
/**
 * Obtem a posição j.
 * @return posição j.
 * */
    public int getJ() {
        return j;
    }
}
