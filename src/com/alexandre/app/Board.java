package com.alexandre.app;

/**
 * Tabuleiro do jogo.
 * */
@SuppressWarnings("all")
public class Board {

    private char[][] matriz;
/**
 * Construtor
 * */
    public Board() {
        //Matriz 3x3
        matriz = new char[3][3];
        zerar();
    }

/**
 * Coloca um caracter em branco em todas as posições da matriz.
 * */
    public void zerar() {
        for (int i =0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = ' ';
            }
        }
    }

/**
 * Imprimir todos os elementos da matriz
 * * */

    public void imprimir() {
       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[0].length; j++) {
               System.out.print(matriz[i][j]);

               if (j < matriz[0].length - 1) {
                   System.out.print(" | ");
               }
           }
           System.out.println();

           if (i < matriz[0].length - 1) {
               System.out.println("---------");
           }
       }
        System.out.println();
    }

    /**
     * Verifica se há espaços em branco no tabuleiro.
     * Se estiver completo retorna true, caso contrário false.
     * */
    public boolean isComplete() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean makeMove(Move move, char simbolo) throws InvalidMoveException {
        int i = move.getI();
        int j = move.getJ();

        //Verifica se a jogada é válida para a matriz
        if (i < 0 || j < 0 || i >= matriz.length || j >= matriz[0].length) {
            throw new InvalidMoveException("Jogada inválida!");
        }

        //Verificar se a jogada já foi realizada
        if (matriz[i][j] != ' ') {
            throw new InvalidMoveException("Jogada inválida!");
        }

        //Símbolo na posição específica
        matriz[i][j] = simbolo;

        //Retorna se houve uma sequencia
        return isSequenceFound();
    }
/**
 * Verifica se uma sequencia de 3 símbolos foi encontrada.
 * @return true se foi encontrada, caso contrário false.
 * */
    public boolean isSequenceFound() {
        if(matriz[0][0] == matriz[0][1] && matriz[0][1] == matriz[0][2] && matriz[0][0] != ' ') {
            return true;
        }

        if(matriz[1][0] == matriz[1][1] && matriz[1][1] == matriz[1][2] && matriz[1][0] != ' ') {
            return true;
        }

        if(matriz[2][0] == matriz[2][1] && matriz[2][1] == matriz[2][2] && matriz[2][0] != ' ') {
            return true;
        }

        if(matriz[0][0] == matriz[1][0] && matriz[1][0] == matriz[2][0] && matriz[0][0] != ' ') {
            return true;
        }

        if(matriz[0][1] == matriz[1][1] && matriz[1][1] == matriz[2][1] && matriz[0][1] != ' ') {
            return true;
        }

        if(matriz[0][2] == matriz[1][2] && matriz[1][2] == matriz[2][2] && matriz[0][2] != ' ') {
            return true;
        }

        if(matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[0][0] != ' ') {
            return true;
        }

        if(matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[0][2] != ' ') {
            return true;
        }

        return false;
    }
}
