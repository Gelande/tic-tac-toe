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
}
