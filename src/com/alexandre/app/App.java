package com.alexandre.app;
@SuppressWarnings("all")
public class App {
    public static void main(String[] args) {

        Game game = new Game();

        Board board = new Board();
        board.imprimir();
        System.out.println(board.isComplete());
    }

    /**
     *
     * */
    public boolean makeMove() {
        return false;
    }
}
