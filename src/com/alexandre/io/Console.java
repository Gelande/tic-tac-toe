package com.alexandre.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
@SuppressWarnings("all")
public class Console {
/**
 * Lê uma string do console.
 * @return a string lida.
 * */
    public static String readString() {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Erro na leitura dos dados.");
        }
    }
/**
 * Lê um valor do tipo inteiro do console.
 * @return um int
 * */
    public static int readInt() {

        String str = readString();
        return Integer.parseInt(str);
    }
    /**
     * Lê um valor do tipo double do console.
     * @return um double.
     * */
    public static double readDouble() {

        String str = readString();
        return Double.parseDouble(str);
    }

}
