package com.alexandre.app;
/**
 * Exception de jogada inválida
 * */
@SuppressWarnings("all")
public class InvalidMoveException extends TicTacToeException{
    public InvalidMoveException(String message) {
        super(message);
    }
}
